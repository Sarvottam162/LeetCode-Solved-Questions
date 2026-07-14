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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        helper(root , li);

        return li.get( k - 1);
    }
    public void helper(TreeNode root  ,ArrayList<Integer> li){

        if(root == null) return;

        helper(root.left , li);
        li.add(root.val);
        helper(root.right , li);
    }
}