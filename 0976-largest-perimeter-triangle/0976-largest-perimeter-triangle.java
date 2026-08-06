class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int perimeter = 0;
        if(nums.length < 3) return 0;

        for(int i = 0; i<nums.length-2; i++){
            int curr = 0;
            if(nums[i] + nums[i+1] > nums[i+2]){
                curr +=nums[i] + nums[i+1] + nums[i+2];
                perimeter = Math.max(curr,perimeter);
            }
        }
        return perimeter;
    }
}