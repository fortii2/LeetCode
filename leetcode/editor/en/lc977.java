/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int p = 0, q = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int lv = nums[p] * nums[p];
            int rv = nums[q] * nums[q];

            if (lv > rv) {
                res[i] = lv;
                p++;
            } else {
                res[i] = rv;
                q--;
            }
        }

        return res;
    }
}
// @lc code=end
