/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> finalList = new ArrayList<>();
        if(root == null) return finalList;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int n = 1;

        while(!q.isEmpty()){
            int size = q.size();
        
            ArrayList<Integer> currList = new ArrayList<>();

            while(size > 0){
                TreeNode curr = q.remove();
                currList.add(curr.val);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                size--;
            }
            if(n % 2 == 0){
                Collections.reverse(currList);
            }
            finalList.add(currList);
            n++;
        }

        return finalList;
    }
}