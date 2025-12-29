package leetcode.editor.en;

public class lc2390 {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeStars(String s) {
            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }
}


//    public String removeStars(String s) {
//        Stack stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '*'){
//                stack.pop();
//            } else {
//                stack.push(c);
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < stack.size(); i++) {
//            sb.append(stack.get(i));
//        }
//        return sb.toString();
//    }
//leetcode submit region end(Prohibit modification and deletion)