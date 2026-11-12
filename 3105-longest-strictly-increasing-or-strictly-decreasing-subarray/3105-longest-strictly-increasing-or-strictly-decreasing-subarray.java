class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int n = nums.length;
        for(int i = 0 ; i < n-1; i++){
            int curr = 1;
            for(int j = i+1; j<n; j++){
                if(nums[j] <= nums[j-1]){
                    break;
                }
                curr++;
            }
            inc = Math.max(inc , curr);
        }


        for(int i = 0 ; i < n-1; i++){
            int curr = 1;
            for(int j = i+1; j<n; j++){
                if(nums[j] >= nums[j-1]){
                    break;
                }
                curr++;
            }
            dec = Math.max(dec , curr);
        }
        return Math.max(inc,dec);
    }
}