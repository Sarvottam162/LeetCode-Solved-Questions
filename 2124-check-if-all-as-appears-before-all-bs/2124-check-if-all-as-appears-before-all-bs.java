class Solution {
    public boolean checkString(String s) {

        int n = s.length();
        
        int countA = 0;

        int i = 0 ;

        for(; i < n; i++){
            char ch = s.charAt(i);
            if(ch == 'a')countA++;
            else{
                break;
            }
        }
        for(; i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'a')return false;
        }

        return true;
    }
}