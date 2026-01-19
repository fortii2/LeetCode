package leetcode.editor.en;
/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int candidate = x;

        while (left <= right) {
            int mid = (left + right) / 2;
            long temp = (long) mid * mid;

            if (temp < x) {
                left = mid + 1;
                candidate = mid;
            } else if (temp > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return candidate;
    }
}
// @lc code=end
