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
    public boolean hasCycle(ListNode head) {
        ListNode fast = new ListNode();
        fast = head;
        
        if (fast == null || fast.next == null || fast.next.next == null) {
            return false;
        }

        ListNode slow = fast;
        fast = fast.next;

        while (fast != slow && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if  (fast == slow && fast.next != null && fast.next.next != null) {
            return true;
        }
        else 
            return false;
    }
}
