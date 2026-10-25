class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int maxCount = 1;
        int count = 1;

        for(int i = 1 ; i < n; i++){
            if(nums[i] > nums[i-1])count++;
            else count = 1;
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;

    }
}