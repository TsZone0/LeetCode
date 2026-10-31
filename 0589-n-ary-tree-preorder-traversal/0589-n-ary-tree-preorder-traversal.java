/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        int val = root.val;
        result.add(val);

        for(Node data: root.children){
            result.addAll(preorder(data));
        }
        return result;
    }
}