class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] nums = cardPoints;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int lsum = 0;
        int rsum = 0;
        int li = n - 1;
        for(int i = 0 ; i<k; i++){
            lsum = lsum + nums[i];
        }
        max = lsum;
        for(int i = k-1; i>=0 ; i--){
            lsum -= nums[i];
            rsum += nums[li];
            li--;
            max = Math.max(max, lsum + rsum);
        }
        return max;
    }
}