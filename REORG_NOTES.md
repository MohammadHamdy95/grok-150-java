# Reorganization Notes

Reorganized the repo into Blind 75 / NeetCode-style algorithm categories, created
blank placeholder classes for every problem not already present, and added
JUnit tests for everything.

## Update — expanded to the full NeetCode 150 + renamed to `grok-150-java`
- Coverage was extended from Blind 75 to the **full NeetCode 150** (the roadmap order in
  the source repo). **72 new problem classes** were added across all 18 categories, each
  with a `@Disabled` test. Helper `linkedlist/Node` (random pointer) was added for
  Copy List With Random Pointer.
- The two `[Ex]` (extra, not part of the roadmap 150) tree problems — *Lowest Common
  Ancestor of a Binary Tree* (0236) and *Serialize and Deserialize BST* (0449) — were
  intentionally **not** created.
- Gradle `rootProject.name` and the GitHub repo were renamed `blind-75-java` →
  `grok-150-java` (remote: `MohammadHamdy95/grok-150-java`).
- Latest `./gradlew test`: **301 tests — 25 passed, 3 failed (the documented bug below),
  273 disabled.**
- New design classes use canonical LeetCode names: `MinStack`, `TimeMap` (Time Based
  Key-Value Store), `LRUCache`, `KthLargest` (Kth Largest in a Stream), `Twitter`
  (Design Twitter), `DetectSquares`.

### New classes added by category (72)
- **Arrays & Hashing:** `ValidSudoku`
- **Two Pointers:** `TrappingRainWater`
- **Stack:** `MinStack`, `EvaluateReversePolishNotation`, `GenerateParentheses`, `DailyTemperatures`, `CarFleet`, `LargestRectangleInHistogram`
- **Binary Search:** `BinarySearch`, `SearchA2DMatrix`, `KokoEatingBananas`, `TimeMap`, `MedianOfTwoSortedArrays`
- **Sliding Window:** `PermutationInString`, `SlidingWindowMaximum`
- **Linked List:** `CopyListWithRandomPointer`, `AddTwoNumbers`, `FindTheDuplicateNumber`, `LRUCache`, `ReverseNodesInKGroup`
- **Trees:** `DiameterOfBinaryTree`, `BalancedBinaryTree`, `BinaryTreeRightSideView`, `CountGoodNodesInBinaryTree`
- **Backtracking:** `Subsets`, `Permutations`, `SubsetsII`, `CombinationSumII`, `PalindromePartitioning`, `LetterCombinationsOfAPhoneNumber`, `NQueens`
- **Heap / Priority Queue:** `KthLargest`, `LastStoneWeight`, `KClosestPointsToOrigin`, `KthLargestElementInAnArray`, `TaskScheduler`, `Twitter`
- **Graphs:** `MaxAreaOfIsland`, `WallsAndGates`, `RottingOranges`, `SurroundedRegions`, `CourseScheduleII`, `RedundantConnection`, `WordLadder`
- **Advanced Graphs:** `ReconstructItinerary`, `MinCostToConnectAllPoints`, `NetworkDelayTime`, `SwimInRisingWater`, `CheapestFlightsWithinKStops`
- **1-D DP:** `MinCostClimbingStairs`, `PartitionEqualSubsetSum`
- **2-D DP:** `BestTimeToBuyAndSellStockWithCooldown`, `CoinChangeII`, `TargetSum`, `InterleavingString`, `LongestIncreasingPathInAMatrix`, `DistinctSubsequences`, `EditDistance`, `BurstBalloons`, `RegularExpressionMatching`
- **Greedy:** `HandOfStraights`, `MergeTripletsToFormTargetTriplet`, `PartitionLabels`, `ValidParenthesisString`
- **Intervals:** `MinimumIntervalToIncludeEachQuery`
- **Math & Geometry:** `HappyNumber`, `PlusOne`, `PowXN`, `MultiplyStrings`, `DetectSquares`
- **Bit Manipulation:** `SingleNumber`, `ReverseInteger`

---

## Original Blind 75 pass (below)

Source of truth for categories and the problem list:
https://github.com/envico801/Neetcode-150-and-Blind-75 (Blind 75 scope, matching the
`blind-75-java` repo name).

**No solutions were written or copied.** Existing code was only moved (package updated);
new classes throw `UnsupportedOperationException("Not implemented yet.")`.

## How tests are wired
- **Existing, completed classes** → active tests (run normally).
- **Blank/placeholder classes** → tests are present but annotated `@Disabled("Solution not implemented yet.")`, so they are *ready* but neither pass nor fail until you implement the solution.
- Test data uses canonical LeetCode examples plus edge/tricky cases.

## Build / test status (latest run)
`./gradlew test` → **176 tests: 25 passed, 3 failed, 148 skipped (disabled).**

The **3 failures are intentional and documented** (a genuine bug in an existing solution — see below). Everything else is green or disabled.

---

## 1. Categories (packages) created
Base package: `com.mohamdy.blind75`

| Package | Category |
|---|---|
| `arraysandhashing` | Arrays & Hashing |
| `twopointers` | Two Pointers |
| `slidingwindow` | Sliding Window |
| `stack` | Stack |
| `binarysearch` | Binary Search |
| `linkedlist` | Linked List |
| `trees` | Trees |
| `tries` | Tries |
| `heap` | Heap / Priority Queue |
| `backtracking` | Backtracking |
| `graphs` | Graphs |
| `advancedgraphs` | Advanced Graphs |
| `dp1d` | 1-D Dynamic Programming |
| `dp2d` | 2-D Dynamic Programming |
| `greedy` | Greedy |
| `intervals` | Intervals |
| `mathgeometry` | Math & Geometry |
| `bitmanipulation` | Bit Manipulation |
| `uncategorized` | Could not confidently map to a Blind 75 category |

`dp1d` / `dp2d` are used as concise, legal Java package names (a package segment cannot start with a digit, so `1ddp` is invalid).

---

## 2. Existing classes moved
All package declarations were updated; logic was **not** changed (except `GasStation`, see §6).

| Class | From | To |
|---|---|---|
| `TwoSum` | `blind75` | `blind75.arraysandhashing` |
| `LongestConsecutiveSequence` | `blind75` | `blind75.arraysandhashing` |
| `TwoSumNonOrder` | `blind75` | `blind75.twopointers` |
| `LongestSubstringWithoutRepeating` | `blind75` | `blind75.slidingwindow` |
| `JumpGame` | `blind75` | `blind75.greedy` |
| `MinJumpsII` (Jump Game II) | `blind75` | `blind75.greedy` |
| `GasStation` | `blind75` | `blind75.greedy` |
| `MinLength` | `blind75` | `blind75.uncategorized` |

The stale test `src/test/.../arrays/TwoSumTest.java` referenced a `TwoSum` that no longer
existed in that package (the project did not compile). It was removed and replaced by a
proper `arraysandhashing/TwoSumTest.java`.

---

## 3. Blank placeholder classes created (71)
Each has the expected public LeetCode method signature and throws
`UnsupportedOperationException`. A matching `@Disabled` test exists for each.

**Arrays & Hashing:** `ContainsDuplicate`, `ValidAnagram`, `GroupAnagrams`, `TopKFrequentElements`, `ProductOfArrayExceptSelf`, `EncodeAndDecodeStrings`
*(Two Sum and Longest Consecutive Sequence already existed.)*

**Two Pointers:** `ValidPalindrome`, `ThreeSum`, `ContainerWithMostWater`

**Sliding Window:** `BestTimeToBuyAndSellStock`, `LongestRepeatingCharacterReplacement`, `MinimumWindowSubstring`
*(Longest Substring Without Repeating Characters already existed as `LongestSubstringWithoutRepeating`.)*

**Stack:** `ValidParentheses`

**Binary Search:** `FindMinimumInRotatedSortedArray`, `SearchInRotatedSortedArray`

**Linked List:** `ReverseLinkedList`, `MergeTwoSortedLists`, `ReorderList`, `RemoveNthNodeFromEndOfList`, `LinkedListCycle`, `MergeKSortedLists`

**Trees:** `InvertBinaryTree`, `MaximumDepthOfBinaryTree`, `SameTree`, `SubtreeOfAnotherTree`, `LowestCommonAncestorOfABST`, `BinaryTreeLevelOrderTraversal`, `ValidateBinarySearchTree`, `KthSmallestElementInABST`, `ConstructBinaryTreeFromPreorderAndInorderTraversal`, `BinaryTreeMaximumPathSum`, `SerializeAndDeserializeBinaryTree`

**Tries:** `Trie`, `WordDictionary`, `WordSearchII`

**Heap / Priority Queue:** `MedianFinder`

**Backtracking:** `CombinationSum`, `WordSearch`

**Graphs:** `NumberOfIslands`, `CloneGraph`, `PacificAtlanticWaterFlow`, `CourseSchedule`, `GraphValidTree`, `NumberOfConnectedComponentsInAnUndirectedGraph`

**Advanced Graphs:** `AlienDictionary`

**1-D DP:** `ClimbingStairs`, `HouseRobber`, `HouseRobberII`, `LongestPalindromicSubstring`, `PalindromicSubstrings`, `DecodeWays`, `CoinChange`, `MaximumProductSubarray`, `WordBreak`, `LongestIncreasingSubsequence`

**2-D DP:** `UniquePaths`, `LongestCommonSubsequence`

**Greedy:** `MaximumSubarray`
*(Jump Game already existed; Jump Game II = `MinJumpsII` and Gas Station = `GasStation` already existed — these two are NeetCode-150 extras, not strict Blind 75, but kept in `greedy`.)*

**Intervals:** `InsertInterval`, `MergeIntervals`, `NonOverlappingIntervals`, `MeetingRooms`, `MeetingRoomsII`

**Math & Geometry:** `RotateImage`, `SpiralMatrix`, `SetMatrixZeroes`

**Bit Manipulation:** `NumberOf1Bits`, `CountingBits`, `ReverseBits`, `MissingNumber`, `SumOfTwoIntegers`

### Helper scaffolding (not solutions)
Standard LeetCode-provided data-structure definitions, needed so signatures compile:
- `linkedlist/ListNode`
- `trees/TreeNode`
- `graphs/Node` (for Clone Graph)
- `src/test/.../linkedlist/ListNodes` (test-only helper to build/read linked lists)

---

## 4. Test classes created
- **79 test classes total**: 71 disabled (placeholders) + 8 for existing classes.
- Of the existing-class tests, 7 are active and 1 is disabled (`GasStation`, see §6).

Active tests: `TwoSumTest`, `LongestConsecutiveSequenceTest`, `TwoSumNonOrderTest`,
`JumpGameTest`, `MinJumpsIITest`, `MinLengthTest`, `LongestSubstringWithoutRepeatingTest`.

---

## 5. Classes placed in `uncategorized`
- **`MinLength`** — not a recognizable LeetCode/Blind 75 problem. It computes a running
  "stack" where each `'B'` cancels a previously pushed unit (if any) and every other
  character pushes. Tests assert its **actual** behavior (it appears self-consistent), e.g.
  `"BABBA" -> 1`, `"BBB" -> 1`, `"AAA" -> 3`, `"" -> 0`.

---

## 6. Existing solutions that appear incorrect (failing/handled)

### `LongestSubstringWithoutRepeating.lengthOfLongestSubstring` — BUG (tests failing on purpose)
Off-by-one: `currentMax` starts at 1 and is incremented for **each** character added, so
the returned length is one larger than the true answer (e.g. `"abc"` returns 4 instead of 3;
`"bbbbb"` returns 2 instead of 1). The active test asserts the **correct** LeetCode answers,
so 3 tests fail by design (`example`, `allSame`, `pwwkew`). Left failing per instructions —
do not "fix" by changing expected values; fix the solution.
- Likely fix: initialize `currentMax = 0` (count added chars), or set `currentMax = y - i`.

### `LongestConsecutiveSequence.longestConsecutive1` — known buggy (not tested)
The author's own comment says it "seems to be failing with really long arrays." The tested
method `longestConsecutive` (the HashSet version) is correct, so tests target that one only.
`longestConsecutive1` is left as-is and untested.

### `GasStation.canCompleteCircuit` — incomplete (did not compile)
The original attempt had no return statement and a no-op `currentTank < currentTank` check,
so the **whole project failed to compile**. To restore compilation without writing a solution,
the body now throws `UnsupportedOperationException` and the original attempt is preserved as a
comment. Its test is `@Disabled`. Implement the standard greedy solution to enable it.

---

## 7. Uncertain method signatures
None were guessed. All Blind 75 signatures used are the canonical LeetCode signatures.

Naming notes:
- **Design problems keep their canonical LeetCode class names** rather than the long
  problem-title form, because the data-structure name *is* the required class:
  - "Implement Trie (Prefix Tree)" → class `Trie`
  - "Design Add and Search Words Data Structure" → class `WordDictionary`
  - "Find Median from Data Stream" → class `MedianFinder`
- "Longest Substring Without Repeating Characters" is covered by the pre-existing class
  `LongestSubstringWithoutRepeating` (non-canonical name kept to avoid a duplicate).
- `TwoSumNonOrder` is the user's existing "Two Sum II (sorted, two-pointer)" attempt. It
  returns **0-based** indices and assumes a sorted input array, whereas LeetCode's
  "Two Sum II" returns **1-based** indices. Tests assert this class's actual 0-based
  behavior; the discrepancy is noted here rather than treated as a bug.
