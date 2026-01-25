/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start

class ListNode {
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
    public ListNode swapPairs(ListNode head) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        ListNode p = sentinel;
        while (p.next != null && p.next.next != null) {
            ListNode nex = p.next;
            p.next = p.next.next;

            ListNode nexnex = p.next.next;
            p.next.next = nex;

            nex.next = nexnex;
            p = p.next.next;
        }

        return sentinel.next;
    }
}
// @lc code=end
