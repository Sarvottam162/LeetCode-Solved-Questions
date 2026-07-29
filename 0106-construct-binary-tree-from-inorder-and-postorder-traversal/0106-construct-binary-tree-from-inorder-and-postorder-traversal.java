
class Solution {
      int postIdx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        postIdx =  postorder.length - 1;
        return helper(inorder , postorder , 0 , n - 1) ;
        
    }
    
    public TreeNode helper(int[] inorder, int[] postorder , int s , int e){

        if(s > e) return null;

        TreeNode root = new TreeNode(postorder[postIdx--]);

        int idx = -1;

        for(int i = s; i<=e; i++){
            if(inorder[i] == root.val){
                idx = i;
                break;
            }
        }
        root.right = helper(inorder , postorder , idx + 1 , e);
        root.left = helper(inorder , postorder , s , idx - 1);
        return root;
    }
}