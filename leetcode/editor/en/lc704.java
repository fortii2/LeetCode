package leetcode.editor.en;

/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // arr [x, y] allows x = y, like [1, 1] -> {1}
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target){
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
// @lc code=end

