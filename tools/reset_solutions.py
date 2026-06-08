#!/usr/bin/env python3
"""
Reset all LeetCode practice solutions back to blank placeholders.

For every problem class in the baseline it:
  1. restores the class to its blank form (method bodies throw
     UnsupportedOperationException, Javadoc / signatures / links preserved), and
  2. re-adds @Disabled to the matching test so the suite stays green.

It does NOT touch: the data-structure helpers (ListNode/TreeNode/Node), the
`misc` package (e.g. MazeSolver), the `support` test helpers, or `MinLength`.

Usage:
    python3 tools/reset_solutions.py              # show changes, then ask to confirm
    python3 tools/reset_solutions.py --yes        # reset without prompting
    python3 tools/reset_solutions.py --dry-run    # only print what would change
    python3 tools/reset_solutions.py --no-backup  # skip the timestamped backup

A timestamped copy of everything that changes is written to .solution_backups/
before anything is overwritten (unless --no-backup).
"""
import argparse
import datetime
import json
import os
import re
import shutil
import sys

REPO = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
BASELINE = os.path.join(REPO, "tools", "solution_baseline.json")
BACKUP_ROOT = os.path.join(REPO, ".solution_backups")
DISABLED_REASON = "Solution not implemented yet."


def test_path_for(main_rel):
    """src/main/.../Foo.java -> src/test/.../FooTest.java"""
    rel = main_rel.replace("src/main/", "src/test/", 1)
    return rel[:-5] + "Test.java"


def needs_solution_reset(path, baseline_content):
    return (not os.path.exists(path)) or open(path, encoding="utf-8").read() != baseline_content


def ensure_disabled(content):
    """Return (new_content, changed) ensuring the test class carries @Disabled."""
    if re.search(r"(?m)^@Disabled\b", content):
        return content, False
    lines = content.split("\n")
    # ensure the import exists
    if "import org.junit.jupiter.api.Disabled;" not in content:
        for i, ln in enumerate(lines):
            if ln.startswith("import org.junit.jupiter.api.Test;"):
                lines.insert(i + 1, "import org.junit.jupiter.api.Disabled;")
                break
    # insert the annotation right before the test class declaration
    for i, ln in enumerate(lines):
        if re.match(r"\s*(final\s+)?class \w+Test\b", ln):
            lines.insert(i, '@Disabled("%s")' % DISABLED_REASON)
            break
    return "\n".join(lines), True


def main():
    ap = argparse.ArgumentParser(description="Reset all practice solutions to blank placeholders.")
    ap.add_argument("--yes", action="store_true", help="do not prompt for confirmation")
    ap.add_argument("--dry-run", action="store_true", help="print what would change, write nothing")
    ap.add_argument("--no-backup", action="store_true", help="do not create a backup")
    args = ap.parse_args()

    if not os.path.exists(BASELINE):
        sys.exit("Baseline not found: %s" % BASELINE)
    baseline = json.load(open(BASELINE, encoding="utf-8"))

    main_changes = []   # (rel, content)
    test_changes = []   # (rel, new_content)
    for rel in sorted(baseline):
        abs = os.path.join(REPO, rel)
        if needs_solution_reset(abs, baseline[rel]):
            main_changes.append((rel, baseline[rel]))
        tp = test_path_for(rel)
        tabs = os.path.join(REPO, tp)
        if os.path.exists(tabs):
            new, changed = ensure_disabled(open(tabs, encoding="utf-8").read())
            if changed:
                test_changes.append((tp, new))

    print("Solutions to reset : %d" % len(main_changes))
    for rel, _ in main_changes:
        print("   reset   %s" % rel.split("grok150/", 1)[-1])
    print("Tests to re-disable: %d" % len(test_changes))
    for rel, _ in test_changes:
        print("   disable %s" % rel.split("grok150/", 1)[-1])

    if not main_changes and not test_changes:
        print("\nNothing to do - everything is already blank and disabled.")
        return
    if args.dry_run:
        print("\n(dry run - no files written)")
        return

    if not args.yes:
        ans = input("\nThis overwrites the files above. Continue? [y/N] ").strip().lower()
        if ans not in ("y", "yes"):
            print("Aborted.")
            return

    # backup
    if not args.no_backup:
        stamp = datetime.datetime.now().strftime("%Y%m%d-%H%M%S")
        dest = os.path.join(BACKUP_ROOT, stamp)
        for rel, _ in main_changes + test_changes:
            src = os.path.join(REPO, rel)
            if os.path.exists(src):
                out = os.path.join(dest, rel)
                os.makedirs(os.path.dirname(out), exist_ok=True)
                shutil.copy2(src, out)
        print("\nBackup written to %s" % os.path.relpath(dest, REPO))

    for rel, content in main_changes:
        open(os.path.join(REPO, rel), "w", encoding="utf-8").write(content)
    for rel, content in test_changes:
        open(os.path.join(REPO, rel), "w", encoding="utf-8").write(content)

    print("Done: %d solutions reset, %d tests re-disabled." % (len(main_changes), len(test_changes)))
    print("Run './gradlew test' to confirm a clean (all-green / disabled) suite.")


if __name__ == "__main__":
    main()
