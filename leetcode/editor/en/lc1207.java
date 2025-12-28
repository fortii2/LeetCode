package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;

public class lc1207 {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j : arr) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }

            HashSet<Integer> integers = new HashSet<>(map.values());

            return integers.size() == map.size();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}