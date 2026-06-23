class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int res[] = new int[2];
        HashMap<Integer ,Integer> map1 = new HashMap<>();
        HashMap<Integer ,Integer> map2 = new HashMap<>();

        for(int ele : nums1){
            map1.put(ele , map1.getOrDefault(ele, 0) + 1);
        }
        for(int ele : nums2){
            map2.put(ele , map2.getOrDefault(ele, 0) + 1);
        }

        for(int ele : nums1){
          if(map2.containsKey(ele)) res[0]++;
        }
        for(int ele : nums2){
            if(map1.containsKey(ele)) res[1]++;
        }
        
        return res;
    }
}