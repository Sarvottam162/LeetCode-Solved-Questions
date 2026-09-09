class Solution {
    public int lengthOfLongestSubstring(String s) {

        // method 1

        // HashSet<Character> set = new HashSet<>();
        // int windowStart = 0 ;
        // int windowEnd = 0 ;
        // int n = s.length();
        // int length = 0;

        // while(windowEnd < n){
        //     char ch = s.charAt(windowEnd);
        //     if(!set.contains(ch)){
        //         set.add(ch);
        //         int currLength = set.size();
        //         length = Math.max(length , currLength);
        //     }
        //     else{
        //         while(windowStart < windowEnd && set.contains(ch)){
        //             char ch1 = s.charAt(windowStart);
        //             set.remove(ch1);
        //             windowStart++;
        //         }
        //         set.add(ch);
        //     }
        //     windowEnd++;
        // }
        // return length;

        // method 2

        HashMap<Character , Integer> map = new HashMap<>();
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        int length = 0;

        while(windowEnd < n){
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch) && map.get(ch) >= windowStart){
                windowStart = map.get(ch) + 1;
            }
            map.put(ch , windowEnd);
            length = Math.max(length,windowEnd - windowStart + 1);
            windowEnd++;
        }
        return length;
    }
}