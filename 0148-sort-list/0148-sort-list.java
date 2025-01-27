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

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list);

        ListNode newHead = new ListNode(list.get(0));
        ListNode newCurr = newHead;
        for (int i = 1; i < list.size(); i++) {
            newCurr.next = new ListNode(list.get(i));
            newCurr = newCurr.next;
        }

        return newHead;
    }
}
