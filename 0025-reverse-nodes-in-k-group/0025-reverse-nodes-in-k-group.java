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

    public ListNode reverseKGroup(ListNode head, int k) {
        //check if k nodes exists in the group
        ListNode curr = head;
        int count = 0;
        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }
        if (count < k) return head; //give new head of reverse grp
        // reverse from head to curr;
        ListNode newHead = reverse(head, k);

        head.next = reverseKGroup(curr, k);

        return newHead;
    }

    private ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null && k > 0) {
            ListNode nextNode = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev forward
            current = nextNode; // Move current forward
            k--;
        }
        return prev; // New head of reversed list
    }
}
