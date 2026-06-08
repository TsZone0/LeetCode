

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null) return null;

        int lh = hight(root.left);
       int rh = hight(root.right);

        if(lh==rh){
            return root;
        }
        if(lh>rh){
            return subtreeWithAllDeepest(root.left);
        }
        else{
            return subtreeWithAllDeepest(root.right);
        }
    }

    private int hight(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(
            hight(root.left),hight(root.right)
        );
    }
}