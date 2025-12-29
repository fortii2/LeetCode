package leetcode.editor.en;

import java.util.Stack;

public class lc735 {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack<>();

            for (int cur : asteroids) {
                boolean alive = true;

                while (alive && !stack.isEmpty() && cur < 0 && stack.peek() > 0) {
                    if (stack.peek() < Math.abs(cur)) {
                        stack.pop();
                    } else if (stack.peek() == Math.abs(cur)) {
                        stack.pop();
                        alive = false;
                    } else {
                        alive = false;
                    }
                }

                if (alive) {
                    stack.push(cur);
                }
            }

            int[] res = new int[stack.size()];
            for (int i = 0; i < stack.size(); i++) {
                res[i] = stack.get(i);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}