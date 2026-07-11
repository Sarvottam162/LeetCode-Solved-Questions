class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int n = nums.length;
        int mul = 1;

        for(int right = 0; right < n ; right++){
            //expend
            mul *= nums[right];

            while(mul >= k){
                mul /= nums[left];
                left++;
            }

             count = count +  (right - left  + 1);
        }
        return count;
    }
}