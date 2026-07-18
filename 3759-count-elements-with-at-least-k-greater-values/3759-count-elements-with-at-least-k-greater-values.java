class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int count = 0;

        if(k == 0) return n;
        

        for(int i = 0; i < n - k ; i++){
            if(nums[i] < nums[n - k]) count++;
        }
        return count;
    }
}