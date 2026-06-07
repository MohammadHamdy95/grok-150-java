package com.mohamdy.grok150.binarysearch;

/**
 * LeetCode 704. Binary Search &mdash; Easy
 *
 * <p>Complexity (optimal): Time O(log n), Space O(1).
 *
 * @see <a href="https://neetcode.io/problems/binary-search/question">https://neetcode.io/problems/binary-search/question</a>
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] != target) {
            return -1;
        }
        int l = -1;
        int r = nums.length;
        int  totalLoop = 0;
        int middle = (l + r) / 2;// 0 + 100 / 2 = 50, 50 + 100 / 2 = 75
        while (l != r) {
            totalLoop++;
            if (totalLoop == 20) {
                break;
            }
            if (nums[middle] > target) {
                int oldMiddle = middle;
                r = middle;
                middle = (r + l) / 2;
                if (oldMiddle == middle) {
                    return -1;
                }
                continue;
            }
            if (nums[middle] < target) {
                int oldMiddle = middle;
                l = middle;
                middle = (r + l) / 2;
                if (oldMiddle == middle) {
                    return -1;
                }
                continue;
            }
            if (nums[middle] == target) {
                return middle;
            }
        }
        return -1;
    }
}
