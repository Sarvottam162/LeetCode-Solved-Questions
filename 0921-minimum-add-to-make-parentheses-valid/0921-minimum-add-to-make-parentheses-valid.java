class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();

        int count = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    count++;
                }
            }
        }
        if(!st.isEmpty()){
            count += st.size();
        }
        return count;
    }
}