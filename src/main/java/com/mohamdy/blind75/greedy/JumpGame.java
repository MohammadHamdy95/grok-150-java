package com.mohamdy.blind75.greedy;

/**
 * LeetCode 55. Jump Game &mdash; Medium
 *
 * @see <a href="https://leetcode.com/problems/jump-game/">https://leetcode.com/problems/jump-game/</a>
 */
public class JumpGame {

    public boolean canJump(int[] nums) {


        int furthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > furthest) {
                return false;
            }

            furthest = Math.max(furthest, nums[i] + i);


            if (furthest >= nums.length-1) {
                return true;
            }
        }
        return  false;
    }

    static void main() {
        JumpGame canJump = new JumpGame();

        int[] nums1 = new int[] {
                4, 2, 0, 0, 2, 0, 1, 3, 0, 0, 1
        };
        System.out.println(canJump.canJump(nums1)); // Expected: true

        int[] nums2 = new int[] {
                3, 2, 1, 0, 4
        };
        System.out.println(canJump.canJump(nums2)); // Expected: false

        int[] nums3 = new int[] {
                2, 3, 1, 1, 4
        };
        System.out.println(canJump.canJump(nums3)); // Expected: true

        int[] nums4 = new int[] {
                0
        };
        System.out.println(canJump.canJump(nums4)); // Expected: true

        int[] nums5 = new int[] {
                1, 0, 1, 0
        };
        System.out.println(canJump.canJump(nums5)); // Expected: false

        int[] nums6 = new int[] {
                5, 0, 0, 0, 0, 0
        };
        System.out.println(canJump.canJump(nums6)); // Expected: true

        int[] nums7 = new int[] {
                2, 0, 0
        };
        System.out.println(canJump.canJump(nums7)); // Expected: true

        int[] nums8 = new int[] {
                2, 0, 1, 0, 4
        };
        System.out.println(canJump.canJump(nums8)); // Expected: false
    }
}
