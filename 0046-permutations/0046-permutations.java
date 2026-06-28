class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> fl = new ArrayList<>();
        backtracking(nums , fl , new ArrayList<>());
        return fl;
    }
    public void backtracking(int[] nums ,List<List<Integer>> fl , ArrayList<Integer> cl){

        if(cl.size() == nums.length){
            fl.add(new ArrayList<>(cl));
        }
        for(int i = 0; i<nums.length; i++){
            // check cl
            if(cl.contains(nums[i])) continue; // skip kardo id exist
            //choose
            cl.add(nums[i]);
            //recursion
            backtracking(nums ,fl ,cl);
            //unchoose
            cl.remove(cl.size() - 1);
        }
    }
}