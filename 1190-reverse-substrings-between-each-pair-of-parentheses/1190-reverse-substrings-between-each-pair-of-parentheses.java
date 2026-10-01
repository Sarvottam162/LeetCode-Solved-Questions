class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){

                StringBuilder temp = new StringBuilder();

                while(st.peek() != '('){
                    temp.append(st.pop());
                }
                st.pop();

                for(int i = 0 ; i<temp.length(); i++){
                    st.push(temp.charAt(i));
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}