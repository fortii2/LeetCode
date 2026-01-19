/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start

/**
 * every time program finds a number not equals to cur, add after it.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 0, slow = 0;

        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }
}
// @lc code=end
