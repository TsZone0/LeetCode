/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 import java.util.ArrayList;
class Solution {
    public static boolean findpath(TreeNode root, TreeNode data , ArrayList<TreeNode> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root==data){
            return true;
        }
        boolean foundleft = findpath(root.left , data, path);
        boolean foundright = findpath(root.right , data, path);

        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        findpath(root,p,path1);
        findpath(root,q, path2);

        int i =0;
        for(;i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        TreeNode result = path1.get(i-1);
        return result;

    }
}