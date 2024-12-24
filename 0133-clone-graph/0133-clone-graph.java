/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        dfs(node, map);
        //loop through map to create link between the nodes
        for (Node oldNode : map.keySet()) {
            Node newNode = map.get(oldNode);
            for (Node neighbor : oldNode.neighbors) {
                newNode.neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
    }

    private void dfs(Node node, HashMap<Node, Node> map) {
        if (map.containsKey(node)) return;
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        for (Node neighbor : node.neighbors) {
            dfs(neighbor, map);
        }
    }
}
