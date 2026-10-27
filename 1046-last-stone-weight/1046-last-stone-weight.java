class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        if( n == 1 )return stones[0];

        int x = -1;
        int y = -1;
        
        Arrays.sort(stones);

        while(true){
            x = stones[n - 2];
            y = stones[n - 1];

        if(x <= y && x != -1  && y != -1){

            if(x == y){
                stones[n-1] = -1;
                stones[n-2] = -1;
            }
            else{
                stones[n - 1] = y - x;
                stones[n - 2] = -1;
            }

        }
        else{ 
            break;
        }
        Arrays.sort(stones);
        }
        for(int i= 0 ; i<n; i++){
            if(stones[i] != -1){
                return stones[i];
            }
        }
        return 0;
    }
}