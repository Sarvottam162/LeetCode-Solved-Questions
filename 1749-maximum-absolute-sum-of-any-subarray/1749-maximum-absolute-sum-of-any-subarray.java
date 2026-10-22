class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int maxSum = 0;
        int min = Integer.MIN_VALUE;
        int minSum = 0;
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            maxSum += nums[i];
            minSum += nums[i];
            maxi = Math.max(maxi,maxSum);
            min = Math.min(min,minSum);
            ans = Math.max(Math.max(Math.abs(minSum) , ans),maxSum);
            if(maxSum < 0) maxSum = 0;
            if(minSum > 0) minSum = 0;
        }
        return ans;
    }
}