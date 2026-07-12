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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> li = new ArrayList<>();
        
        helper(root, li ,"");

        return li;
    }

    public void helper(TreeNode root , ArrayList<String> li , String curr){

        if(root == null) return ;
        
        if(root.left == null && root.right == null){
            curr += root.val;
            li.add(curr);
        }
        helper(root.left , li , curr + root.val + "->");
        helper(root.right , li , curr + root.val + "->");
    }
}