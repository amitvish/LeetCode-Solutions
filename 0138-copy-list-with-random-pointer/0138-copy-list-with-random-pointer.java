/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    public Node copyRandomList(Node head) {
        //create a map and
        HashMap<Node, Node> map = new HashMap<>();
        //link old to new
        Node oldNode = head;
        while (oldNode != null) {
            Node newNode = new Node(oldNode.val);
            map.put(oldNode, newNode);
            oldNode = oldNode.next;
        }
        //now hashmap has both old and new nodes;
        //now need to link to correct nodes
        oldNode = head;
        while (oldNode != null) {
            Node newNode = map.get(oldNode);
            newNode.next = map.get(oldNode.next);
            newNode.random = map.get(oldNode.random);
            oldNode = oldNode.next;
        }
        return map.get(head);
    }
}
