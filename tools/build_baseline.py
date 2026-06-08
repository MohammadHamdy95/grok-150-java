import os, json
MAIN="src/main/java/com/mohamdy/grok150"
HELPERS={"ListNode","TreeNode","Node"}
SKIP_PKGS={"misc"}
SKIP_CLASSES={"MinLength"}
CANON='throw new UnsupportedOperationException("Not implemented yet.");'

# class -> (pkg, [imports], return_type, signature, num, title, diff, time, space, slug)
RECON={
 "TwoSum":("arraysandhashing",[],"int[]","twoSum(int[] nums, int target)",1,"Two Sum","Easy","O(n)","O(n)","two-integer-sum"),
 "LongestConsecutiveSequence":("arraysandhashing",[],"int","longestConsecutive(int[] nums)",128,"Longest Consecutive Sequence","Medium","O(n)","O(n)","longest-consecutive-sequence"),
 "TwoSumNonOrder":("twopointers",[],"int[]","twoSum(int[] nums, int target)",167,"Two Sum II - Input Array Is Sorted","Medium","O(n)","O(1)","two-integer-sum-ii"),
 "LongestSubstringWithoutRepeating":("slidingwindow",[],"int","lengthOfLongestSubstring(String s)",3,"Longest Substring Without Repeating Characters","Medium","O(n)","O(min(n, alphabet))","longest-substring-without-duplicates"),
 "BestTimeToBuyAndSellStock":("slidingwindow",[],"int","maxProfit(int[] prices)",121,"Best Time to Buy and Sell Stock","Easy","O(n)","O(1)","buy-and-sell-crypto"),
 "BinarySearch":("binarysearch",[],"int","search(int[] nums, int target)",704,"Binary Search","Easy","O(log n)","O(1)","binary-search"),
 "Subsets":("backtracking",["java.util.List"],"List<List<Integer>>","subsets(int[] nums)",78,"Subsets","Medium","O(n·2^n)","O(n) extra (excluding output)","subsets"),
 "SubsetsII":("backtracking",["java.util.List"],"List<List<Integer>>","subsetsWithDup(int[] nums)",90,"Subsets II","Medium","O(n·2^n)","O(n) extra (excluding output)","subsets-ii"),
 "AddTwoNumbers":("linkedlist",[],"ListNode","addTwoNumbers(ListNode l1, ListNode l2)",2,"Add Two Numbers","Medium","O(max(n, m))","O(max(n, m)) (output)","add-two-numbers"),
 "RemoveNthNodeFromEndOfList":("linkedlist",[],"ListNode","removeNthFromEnd(ListNode head, int n)",19,"Remove Nth Node From End of List","Medium","O(n)","O(1)","remove-node-from-end-of-linked-list"),
 "ClimbingStairs":("dp1d",[],"int","climbStairs(int n)",70,"Climbing Stairs","Easy","O(n)","O(1)","climbing-stairs"),
 "MaximumSubarray":("greedy",[],"int","maxSubArray(int[] nums)",53,"Maximum Subarray","Medium","O(n)","O(1)","maximum-subarray"),
 "JumpGame":("greedy",[],"boolean","canJump(int[] nums)",55,"Jump Game","Medium","O(n)","O(1)","jump-game"),
 "MinJumpsII":("greedy",[],"int","jump(int[] nums)",45,"Jump Game II","Medium","O(n)","O(1)","jump-game-ii"),
 "GasStation":("greedy",[],"int","canCompleteCircuit(int[] gas, int[] cost)",134,"Gas Station","Medium","O(n)","O(1)","gas-station"),
 "PartitionLabels":("greedy",["java.util.List"],"List<Integer>","partitionLabels(String s)",763,"Partition Labels","Medium","O(n)","O(1) (fixed alphabet)","partition-labels"),
 "ValidParenthesisString":("greedy",[],"boolean","checkValidString(String s)",678,"Valid Parenthesis String","Medium","O(n)","O(1)","valid-parenthesis-string"),
}

def is_blank(content):
    """True only if the class body has no statements other than the canonical throw."""
    for ln in content.split("\n"):
        s=ln.strip()
        if not s or s.startswith(("//","*","/*","package ","import ","@")): continue
        if s in ("{","}"): continue
        if s.endswith(";") and s!=CANON:
            return False
    return True

def blank(pkg,cls,imports,ret,sig,num,title,diff,t,s,slug):
    L=["package com.mohamdy.grok150.%s;"%pkg,""]
    for i in imports: L.append("import %s;"%i)
    if imports: L.append("")
    url="https://neetcode.io/problems/%s/question"%slug
    L+=[ "/**",
         " * LeetCode %d. %s &mdash; %s"%(num,title,diff),
         " *",
         " * <p>Complexity (optimal): Time %s, Space %s."%(t,s),
         " *",
         ' * @see <a href="%s">%s</a>'%(url,url),
         " */",
         "public class %s {"%cls,
         "",
         "    public %s %s {"%(ret,sig),
         '        throw new UnsupportedOperationException("Not implemented yet.");',
         "    }",
         "}"]
    return "\n".join(L)+"\n"

baseline={}; snap=0; recon=0; errors=[]
for root,_,files in os.walk(MAIN):
    for fn in sorted(files):
        if not fn.endswith(".java"): continue
        cls=fn[:-5]; rel=os.path.join(root,fn); pkg=os.path.basename(root)
        if cls in HELPERS or pkg in SKIP_PKGS or cls in SKIP_CLASSES: continue
        content=open(rel).read()
        if is_blank(content):
            baseline[rel]=content; snap+=1
        elif cls in RECON:
            baseline[rel]=blank(RECON[cls][0],cls,*RECON[cls][1:]); recon+=1
        else:
            errors.append(rel)

json.dump(baseline, open("tools/solution_baseline.json","w"), indent=0, ensure_ascii=False)
print("baseline classes:",len(baseline)," snapshotted:",snap," reconstructed:",recon)
if errors:
    print("!! IMPLEMENTED but NOT in RECON (need a signature added):")
    for e in errors: print("   ",e.split("grok150/",1)[-1])
