class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> fl = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates , new ArrayList<>() ,fl ,target , 0);
        return fl;
    }

    public void  backtracking(int[]candidates , ArrayList<Integer> cl ,List<List<Integer>> fl ,int target , int startIdx){

        if(target < 0) return ;
        else if(target == 0){
            fl.add(new ArrayList<>(cl));
        }
        else{

            for(int i = startIdx ;  i<candidates.length; i++){

                // choose
                cl.add(candidates[i]);
                //recursion
                backtracking(candidates , cl ,fl ,target - candidates[i] , i);
                //unchoose
                cl.remove(cl.size() - 1);
            }
        }
    }
}