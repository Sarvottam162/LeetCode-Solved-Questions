class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        int neg = n/2;
     
        long negativeSum = 0;
        for(int i = 0; i<neg; i++){
            negativeSum += nums[i];
        }
        long positiveSum = 0;

        for(int i = neg; i < n; i++){
            positiveSum += nums[i];
        }
        return positiveSum - negativeSum;

    }
}