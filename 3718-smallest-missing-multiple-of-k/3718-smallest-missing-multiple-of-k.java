class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        for(int i = 1; i>=0; i++){
            if(!set.contains(i) && i % k == 0) return i;
        }
        return -1;
    }
}