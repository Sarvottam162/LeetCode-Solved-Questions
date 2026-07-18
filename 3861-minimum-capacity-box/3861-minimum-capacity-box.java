class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int ans = -1;

        for(int i = 0 ; i<n ; i++){

            if(capacity[i] >= itemSize){

                if(ans == -1 || capacity[i] < capacity[ans]){
                    ans = i;
                }
            }
        }
        return ans;
    }
}