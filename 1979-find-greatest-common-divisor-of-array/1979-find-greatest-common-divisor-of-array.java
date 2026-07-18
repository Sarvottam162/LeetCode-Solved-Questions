class Solution {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE; 
    public void smallestandlargest(int[] nums){
        
        int n = nums.length;

        for(int i = 0 ; i<n;i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }

    }
    public int findGCD(int[] nums) {
        
        smallestandlargest(nums);

        for(int i = min; i>=1; i--){
            if(max % i == 0 && min % i == 0) return i;
        }
        return 1;
    }
}