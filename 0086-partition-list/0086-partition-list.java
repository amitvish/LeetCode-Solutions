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

    public ListNode partition(ListNode head, int x) {
        ListNode L1 = new ListNode(0);
        ListNode dummy1 = L1;
        ListNode L2 = new ListNode(0);
        ListNode dummy2 = L2;

        ListNode dummy = head;
        while (dummy != null) {
            if (dummy.val < x) {
                dummy1.next = new ListNode(dummy.val);
                dummy1 = dummy1.next;
            } else {
                dummy2.next = new ListNode(dummy.val);
                dummy2 = dummy2.next;
            }
            dummy = dummy.next;
        }
        dummy1.next = L2.next;
        dummy2.next = null;

        return L1.next;
    }
}
