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

    public boolean isUnivalTree(TreeNode root) {
        int check = root.val;

        return helper(root , check);
    }

    public boolean helper(TreeNode root , int check){
        if(root == null) return true;

        if(root.val != check) return false;

        boolean left = helper(root.left , check);
        boolean right = helper(root.right , check);

        return left && right;
    }
}