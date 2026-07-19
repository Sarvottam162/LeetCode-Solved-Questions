
class Solution {
    List<List<Integer>> fl = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        ArrayList<Integer> li = new ArrayList<>();

        helper(root , targetSum , li);

        return fl;
    }
    public void helper(TreeNode root, int ts , ArrayList<Integer> curr){

        if(root == null) return;

        ts -= root.val;

        curr.add(root.val);

        if(root.left == null && root.right == null && ts == 0){
            fl.add(new ArrayList<>(curr));
            curr.remove(curr.size() - 1);
            return;
        }

        helper(root.left , ts , curr);
        helper(root.right , ts , curr);

        curr.remove(curr.size() -1);

    }
}