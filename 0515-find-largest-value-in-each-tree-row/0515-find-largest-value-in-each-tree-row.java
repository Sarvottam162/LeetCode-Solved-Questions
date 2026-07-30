class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> finalList = new ArrayList<>();
        if(root == null) return finalList;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            
            ArrayList<Integer> currList = new ArrayList<>();

            while(size > 0){
                TreeNode currNode = q.remove();
                currList.add(currNode.val);

                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
                size--;
            }


            int max = Collections.max(currList);
            finalList.add(max);

        }
        return finalList;
    }
}