//Given a binary array nums and an integer k, return the maximum number of 
//consecutive 1's in the array if you can flip at most k 0's. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//Output: 6
//Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//Bolded numbers were flipped from 0 to 1. The longest subarray is underlined. 
//
// Example 2: 
//
// 
//Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
//Output: 10
//Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
//Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// nums[i] is either 0 or 1. 
// 0 <= k <= nums.length 
// 
//
// Related Topics Array Binary Search Sliding Window Prefix Sum 👍 10124 👎 178


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int longest = 0;
        int left = 0, current = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
            }

            if (nums[i] == 0) {
                if (k > 0) {
                    current++;
                    k--;
                } else {
                    while (left < nums.length && nums[left] != 0) {
                        left++;
                        current--;
                    }
                    left++;
//                    current--;
//                    k++;
//
//                    current++
//                    k--;
                }
            }

            longest = Math.max(longest, current);
        }

        return longest;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
