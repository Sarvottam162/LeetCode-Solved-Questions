class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int maxLength = 1;
        int count = 1;
        for(int i = 0; i<n-1; i++){

            if(s.charAt(i+1) == s.charAt(i)) count++;
            
            else count = 1;
            
            maxLength = Math.max(maxLength , count);

        }
        return maxLength;
    }
}