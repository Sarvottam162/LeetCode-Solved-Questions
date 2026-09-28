class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch == ')'){
                st.push(ch);
            }
        }
        int ans = 0;
        int count = 0;

        while(!st.isEmpty()){
            char pop = st.pop();
            if(pop == ')'){
                count++;
            }
            else{
                 count--;    
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}