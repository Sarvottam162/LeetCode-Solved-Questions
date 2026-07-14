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
    public int minDiffInBST(TreeNode root) {

        ArrayList<Integer> li = new ArrayList<>();

        helper(root , li);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<li.size() - 1 ; i++){
            min = Math.min(min , Math.abs(li.get(i+1) - li.get(i)) );
        }
        return min;
        
    }

     public void helper(TreeNode root  ,ArrayList<Integer> li){

        if(root == null) return;

        helper(root.left , li);
        li.add(root.val);
        helper(root.right , li);
    }
}