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
     private TreeNode first = null;
     private TreeNode mid = null;
     private TreeNode prev = null;
     private TreeNode last = null;
    public void recoverTree(TreeNode root) {
      Inorder(root);
      if(first !=null && last!=null){
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
      }
      else if(first !=null && mid != null){
        int temp = first.val;
        first.val = mid.val;
        mid.val = temp;
      }
    }

    public void Inorder(TreeNode root){
          if(root==null){
            return;
        }
         Inorder(root.left);
        if(prev!=null && prev.val>root.val){
            if(first==null){
                first = prev;
                mid = root;
            }else{
                last = root;
            }
        }
        prev = root;
        Inorder(root.right);
    }
}