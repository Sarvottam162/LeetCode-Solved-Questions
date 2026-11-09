class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int windowStart = 0;
        int windowEnd = 0;
        int max = Integer.MIN_VALUE;
        int count = 0 ;//tarck number of zeros in a. window;

        while(windowEnd < n){
            int ele = nums[windowEnd];
            
            if(ele == 0){
                count++;
            }
            //shrinking
                while(count > k){
                    int ele1 = nums[windowStart];
                    if(ele1 == 0){
                        count--;
                    }
                    windowStart++;
                }
            int currLength = windowEnd - windowStart + 1;
            max = Math.max(currLength , max); 
            windowEnd++;
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
}