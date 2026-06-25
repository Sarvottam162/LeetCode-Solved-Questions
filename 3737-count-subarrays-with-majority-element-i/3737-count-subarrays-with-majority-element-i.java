class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == target) count++;
        }
        if(count == 0) return 0;
        count = 0;
        
        for(int i = 0; i<n; i++){
            int tcount = 0;
            int otherc = 0;
            for(int j = i; j<n; j++){
                if(nums[j] == target) tcount++;
                else otherc++;
                if(tcount > otherc) count++;
            }
        }
        return count;
    }
}