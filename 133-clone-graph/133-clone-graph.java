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
        // Checking for null
        if(node == null) return null;
        
        // HashMap for checking existing nodes
        Map<Integer, Node> map = new HashMap<>();
        return cloneGraph(node, map);
    }
    
    private Node cloneGraph(Node node, Map<Integer, Node> map){
        // If already exists, return the same node
        if(map.containsKey(node.val)) return map.get(node.val);
        
        // else
        // Create new copy node and put it into HashMap
        Node copy = new Node(node.val);
        map.put(node.val, copy);
        
        // recursive check function for all neighbors
        for(Node neighbor: node.neighbors) copy.neighbors.add(cloneGraph(neighbor, map));
        
        return copy;
        
    }
    
}