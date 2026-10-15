class Solution {
    public int uniqueCount(int low , int high , List<Integer> nums){
        HashSet<Integer> set = new HashSet<>();

        for(int i = low; i <= high; i++){
            set.add(nums.get(i));
        }
        return set.size();
    }
    public int sumCounts(List<Integer> nums) {

        int n = nums.size();
        int ans = 0;

        for(int i = 0; i<n; i++){
            int low = i;

            for(int j = low; j<n; j++){
                int high = j;

                int count = uniqueCount(low , high , nums);
                ans += count * count;

            }
        }
        return ans;
    }
}