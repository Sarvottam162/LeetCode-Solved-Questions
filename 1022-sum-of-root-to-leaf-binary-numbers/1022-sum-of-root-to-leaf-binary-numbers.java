
class Solution {
   
    ArrayList<String> li = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        helper(root , "");

         int sum = 0;
        for(int i = 0 ; i<li.size(); i++){
            int curr = Integer.parseInt(li.get(i) , 2);
            sum += curr;
        }
        return sum;
    }

    public void helper(TreeNode root , String curr){

    if(root == null) return;

    curr = curr  + root.val;
    
    if(root.left == null && root.right == null){
        li.add(curr);
    }


    helper(root.left , curr);
    helper(root.right , curr);
    }

}