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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //make dummy node and have 2 poinyer
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;
        int length = n;
        while (length > 0) {
            right = right.next;
            length--;
        }
        // now both node at position
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        // delete node after left pointer
        left.next = left.next.next;

        return dummy.next;
    }
}
