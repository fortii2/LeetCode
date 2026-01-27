/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end
