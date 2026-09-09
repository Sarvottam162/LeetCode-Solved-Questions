class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int windowStart = 0 ;
        int windowEnd = 0 ;
        int n = s.length();
        int length = 0;

        while(windowEnd < n){
            char ch = s.charAt(windowEnd);
            if(!set.contains(ch)){
                set.add(ch);
                int currLength = set.size();
                length = Math.max(length , currLength);
            }
            else{
                while(windowStart < windowEnd && set.contains(ch)){
                    char ch1 = s.charAt(windowStart);
                    set.remove(ch1);
                    windowStart++;
                }
                set.add(ch);
            }
            windowEnd++;
        }
        return length;
    }
}