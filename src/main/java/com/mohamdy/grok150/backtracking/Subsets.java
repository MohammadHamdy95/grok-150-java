package com.mohamdy.grok150.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 78. Subsets &mdash; Medium
 *
 * <p>Complexity (optimal): Time O(n·2^n), Space O(n) extra (excluding output).
 *
 * @see <a href="https://neetcode.io/problems/subsets/question">https://neetcode.io/problems/subsets/question</a>
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> masterList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(masterList, current, nums, 0);
        return masterList;
    }

    public void backtrack(
            List<List<Integer>> masterList,
            List<Integer> currentList,
            int[] nums,
            int index
    ) {
        String indent = "  ".repeat(index);

        System.out.println(indent + "Called backtrack()");
        System.out.println(indent + "index = " + index);
        System.out.println(indent + "currentList = " + currentList);

        if (index == nums.length) {
            System.out.println(indent + "Reached end of nums");
            System.out.println(indent + "Adding copy to masterList: " + currentList);

            masterList.add(new ArrayList<>(currentList));

            System.out.println(indent + "masterList now = " + masterList);
            System.out.println(indent + "Returning");
            return;
        }

        System.out.println(indent + "Decision: INCLUDE nums[" + index + "] = " + nums[index]);
        currentList.add(nums[index]);

        System.out.println(indent + "After add, currentList = " + currentList);
        backtrack(masterList, currentList, nums, index + 1);

        System.out.println(indent + "Back from INCLUDE branch");
        System.out.println(indent + "Removing last element: " + currentList.get(currentList.size() - 1));

        currentList.removeLast();
        // If removeLast() does not work, use:
        // currentList.remove(currentList.size() - 1);

        System.out.println(indent + "After remove, currentList = " + currentList);

        System.out.println(indent + "Decision: EXCLUDE nums[" + index + "] = " + nums[index]);
        backtrack(masterList, currentList, nums, index + 1);

        System.out.println(indent + "Back from EXCLUDE branch");
        System.out.println(indent + "Returning from index = " + index);
    }

}
