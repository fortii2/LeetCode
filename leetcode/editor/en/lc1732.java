package leetcode.editor.en;

public class lc1732 {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestAltitude(int[] gain) {
            int largest = 0;
            int current = 0;

            for (int i = 0; i < gain.length; i++) {
                current += gain[i];
                largest = Math.max(largest, current);
            }

            return largest;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}