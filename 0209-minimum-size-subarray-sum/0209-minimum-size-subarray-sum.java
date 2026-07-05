class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0 ;
        for(int right = 0; right < n; right++){
            currSum +=nums[right];
            while(currSum >= target){
                ans = Math.min(ans , right - left + 1);
                //shrink
                currSum = currSum - nums[left];
                left++;
            }
        }
        
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}