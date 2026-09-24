/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) 
            return null;
        ListNode node = new ListNode(head.val, null);
        head = head.next;
        while (head != null) {
            ListNode n = new ListNode(head.val, node);
            node = n;
            head = head.next;
        }
        return node;
    }
}
