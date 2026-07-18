
class Solution {
    public boolean isBalanced(TreeNode root) {
        int check = helper(root);

        return check != -1;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;

        int leftH = helper(root.left);
        
            if(leftH == -1) return -1;

        int rightH = helper(root.right);

            if(rightH == -1) return -1;

        if(Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        return Math.max(leftH , rightH) +1;
    }
}