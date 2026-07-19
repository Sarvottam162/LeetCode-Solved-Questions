class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        helper(root , li);

        int low = 0;
        int high = li.size()-1;

        while(low < high){
            int num1 = li.get(low);
            int num2 = li.get(high);
            int sum = num1 + num2;

            if(sum == k) return true;

            if(sum > k){
                high--;
            }
            else{
            low++;
            }
            
        }
        return false;
    }
    public void helper(TreeNode root , ArrayList<Integer> li){
        if(root == null) return;

        helper(root.left , li);
        li.add(root.val);
        helper(root.right , li);
    }
}