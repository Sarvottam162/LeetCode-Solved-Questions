class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch , map.getOrDefault(ch,0) + 1);
        }
        int ucc = map.size(); // ucc = unique Character Count
        int windowStart = 0;
        int windowEnd = 0;
        int startIndex = -1;
        int minLength = Integer.MAX_VALUE;
        int n = s.length();

        while(windowEnd < n){
            //expension
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) - 1);
                if(map.get(ch) == 0){
                    ucc--;
                }
            }

            //shrinking

            while(ucc == 0){
                int length = windowEnd - windowStart + 1;
                if(length < minLength){
                    minLength = length;
                    startIndex = windowStart;
                }
                ch = s.charAt(windowStart);
                if(map.containsKey(ch)){
                    map.put(ch , map.get(ch) + 1);
                    if(map.get(ch) > 0){
                        ucc++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }

        if(startIndex == -1) return "";
        return s.substring(startIndex , startIndex + minLength);
    }
}