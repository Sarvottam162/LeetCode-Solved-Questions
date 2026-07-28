
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder , inorder , 0 , preorder.length - 1);
    }
    int preIdx = 0;
    public TreeNode helper(int[] preorder, int[] inorder , int s , int e){
        if(s > e) return null;

        TreeNode root = new TreeNode(preorder[preIdx++]);

        int idx = -1;

        int n = preorder.length - 1;
        for(int i = s ; i<=e; i++){
            if(root.val == inorder[i]){
                idx = i;
                break;
            }
        }
        root.left = helper(preorder, inorder , s , idx - 1);
        root.right = helper(preorder, inorder , idx + 1 , e);

        return root;
    }
}