
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }
    public int height(TreeNode root){

        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight , rightHeight) + 1;

    }
    public int diameter(TreeNode root){

        if(root == null) return 0;

        int leftDia = diameter(root.left);
        int leftHeight = height(root.left);

        int rightDia = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDia = leftHeight + rightHeight;

        return Math.max(Math.max(leftDia , rightDia) , selfDia);
    }
}