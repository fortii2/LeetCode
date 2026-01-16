package leetcode.editor.en;

public class lc206 {
    //leetcode submit region begin(Prohibit modification and deletion)
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode result = reverseList(head.next);

            head.next.next = head;
            head.next = null;

            return result;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}