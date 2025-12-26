package leetcode.editor.en;

public class lc1493 {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubarray(int[] nums) {
            int left = 0;
            int longest = 0;
            int zeroCount = 0;

            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zeroCount++;
                }

                while (zeroCount > 1) {
                    if (nums[left] == 0) {
                        zeroCount--;
                    }
                    left++;
                }
                // longest = Math.max(longest, right - left + 1 - 1);
                longest = Math.max(longest, right - left);
            }
            return longest;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}