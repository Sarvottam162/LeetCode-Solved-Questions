
class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int level = 1;
        int ans = -1;

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr != null)  sum += curr.val;
           
            if(curr == null){
                if(sum > max){
                    max = sum;
                    ans = level;
                }
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                sum = 0;
                level++;
            }
            else{
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return ans;
    }
}