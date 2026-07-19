class Solution {
    int final_max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        helper(root);

        return final_max;

    }

    public int helper(TreeNode root){

        if(root == null) return 0 ;

        int left = helper(root.left);
        int right = helper(root.right);

        //case1

        int case1 = left + right + root.val;

        //case2 

        int case2 = root.val + (Math.max(left , right));

        // case3

        int case3 = root.val;

        final_max = Math.max(Math.max(Math.max(final_max , case1) , case2),case3);

        return Math.max(case2,case3);
    }
}