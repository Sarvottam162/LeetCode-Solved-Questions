class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char ch = 'a';
        for(int i = 26; i>=1; i--){
            map.put(ch,i);
            ch++;
        }
        int ans = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch1 = s.charAt(i);
            if(map.containsKey(ch1)){
                ans += map.get(ch1) * (i+1);
            }
        }
        return ans;
    }
}