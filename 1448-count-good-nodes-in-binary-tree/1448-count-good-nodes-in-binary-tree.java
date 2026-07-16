class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
        helper(root , root.val);

        return count;
    }
    public void helper(TreeNode root , int max){

        if(root == null) return ;

        if(root.val >= max){
            count++;
            max = Math.max(max , root.val);
        }

        helper(root.left , max);
        helper(root.right , max);
    }
}