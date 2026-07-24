//method 1---

// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         return diameter(root);
//     }
//     public int height(TreeNode root){

//         if(root == null) return 0;

//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         return Math.max(leftHeight , rightHeight) + 1;

//     }
//     public int diameter(TreeNode root){

//         if(root == null) return 0;

//         int leftDia = diameter(root.left);
//         int leftHeight = height(root.left);

//         int rightDia = diameter(root.right);
//         int rightHeight = height(root.right);

//         int selfDia = leftHeight + rightHeight;

//         return Math.max(Math.max(leftDia , rightDia) , selfDia);
//     }
// }

//method 2 ----


class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diameter;
    }

    public info helper(TreeNode root){

        if(root == null) return new info(0,0);

        info leftinfo = helper(root.left);
        info rightinfo = helper(root.right);

        int diameter = Math.max(Math.max(leftinfo.diameter , rightinfo.diameter),leftinfo.height + rightinfo.height);
        int height = Math.max(leftinfo.height , rightinfo.height)+ 1;

        return new info(diameter , height);
    }
}

class info {
    int diameter;
    int height;
    info(int diameter , int height){
        this.diameter = diameter;
        this.height = height;
    }
}
