package leetcode.editor.en;

import java.util.Stack;

public class lc394 {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String decodeString(String s) {
            Stack<String> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c != ']') {
                    stack.push(c + "");
                } else {
                    StringBuilder str = new StringBuilder();
                    while (!stack.isEmpty() && !stack.peek().equals("[")) {
                        str.insert(0, stack.pop());
                    }

                    stack.pop(); // pop [

                    StringBuilder k = new StringBuilder();
                    while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                        k.insert(0, stack.pop());
                    }

                    stack.push(String.valueOf(str).repeat(
                            Integer.parseInt(String.valueOf(k)))
                    );
                }
            }

            StringBuilder result = new StringBuilder();
            for (String string : stack) {
                result.append(string);
            }

            return result.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}