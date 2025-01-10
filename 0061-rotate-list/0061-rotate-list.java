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

    public ListNode rotateRight(ListNode head, int k) {
        //edge cases
        if (head == null || head.next == null || k == 0) return head;

        //find the length of the list
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        //connect the head and tail to make it circular
        current.next = head;
        current = head;
        int stepsToNewHead = length - (k % length);

        //move the steps
        int i = 1;
        while (i < stepsToNewHead) {
            current = current.next;
            i++;
        }
        ListNode newHead = current.next;
        current.next = null;

        return newHead;
    }
}
