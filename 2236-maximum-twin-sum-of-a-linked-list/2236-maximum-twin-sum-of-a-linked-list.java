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

    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int n = list.size();
        int maxSum = 0;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int currSum = list.get(i) + list.get(j);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
