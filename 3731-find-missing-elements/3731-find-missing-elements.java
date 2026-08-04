class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        HashSet<Integer> set =new HashSet<>();

        for(int ele : nums){
            set.add(ele);
        }
        List<Integer> li = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(!set.contains(i)) li.add(i);
        }
        Collections.sort(li);
        return li;
    }
}