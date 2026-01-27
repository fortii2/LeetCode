/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int[] target = new int[26];
        for (char c : p.toCharArray()) {
            target[c - 'a']++;
        }

        char[] arr = s.toCharArray();
        int[] windows = new int[26];
        int left = 0, right = 0;

        while (right < arr.length) {
            if (right - left >= p.length()) {
                windows[arr[left++] - 'a']--;
            }

            windows[arr[right++] - 'a']++;

            if (Arrays.equals(windows, target)) {
                res.add(left);
            }
        }

        return res;
    }
}

    // public List<Integer> findAnagrams(String s, String p) {
    // List<Integer> res = new ArrayList<>();
    // int left = 0;
    // int right = p.length();
    // char[] charArr = p.toCharArray();
    // Arrays.sort(charArr);
    // String target = new String(charArr);

    // while (right <= s.length()) {
    // char[] tempArr = s.substring(left, right).toCharArray();
    // Arrays.sort(tempArr);
    // String tempStr = new String(tempArr);

    // if (tempStr.equals(target)) {
    // res.add(left);
    // }

    // left++;
    // right++;
    // }

    // return res;
    // }
}
// @lc code=end
