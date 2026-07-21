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
//  method 1 
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         ArrayList<Integer> li = new ArrayList<>();

//         helper(root , li);

//         for(int i = 0; i< li.size() - 1 ; i++){
//             if(li.get(i) >= li.get(i+1)) return false;
//         }
//         return true;
//     }
//     public void helper(TreeNode root , ArrayList<Integer> li){
//         if(root == null) return;


//         helper(root.left , li);
//         li.add(root.val);
//         helper(root.right , li);
//         return;
//     }
// }

// method 2

class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
    public boolean helper(TreeNode root , long min , long max){

        if(root == null) return true;

        //check for false;

        if(root.val >= max || root.val <= min) return false;

        boolean left = helper(root.left , min , root.val);
        boolean right = helper(root.right , root.val , max);
        return left && right;
    }
}