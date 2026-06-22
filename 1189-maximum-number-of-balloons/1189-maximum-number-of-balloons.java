class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n'){
                map.put(ch,map.getOrDefault(ch , 0) + 1);
            }
        }
        if(map.containsKey('b') == false || map.containsKey('a') == false || map.containsKey('l') == false || map.containsKey('o') == false || map.containsKey('n') == false) return 0;
        
        int min = Integer.MAX_VALUE;
        for(char ch : map.keySet()){
            if(ch == 'o' || ch =='l'){
                int val = map.get(ch);
                val = val / 2;
                min= Math.min(min,val);
            }
            else{
                int val = map.get(ch);
                min = Math.min(min , val);
            }
        }
        return min;
    }
}