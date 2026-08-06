class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if( k == 1)return 0;
        int ans = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i = 0 ; i<=n-k; i++){
            ans = Math.min(ans , (nums[i+k-1] - nums[i]));
        }
        return ans;


        
    }
}