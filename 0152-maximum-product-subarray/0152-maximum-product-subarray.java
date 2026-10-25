class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];

        int n = nums.length;

        for(int i = 0; i<n; i++){
            int currProduct = 1;
            for(int j = i ; j<n; j++){
                currProduct *= nums[j];
                ans = Math.max(currProduct , ans);
            }
        }
        return ans;
    }
}