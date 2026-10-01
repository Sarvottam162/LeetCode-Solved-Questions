class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(st.isEmpty() || st.peek() != '('){
                    return false;
                }
                st.pop();
            }
            else if(ch ==']'){
               if(st.isEmpty() || st.peek() != '['){
                    return false;
                }
                st.pop();
            }
            else if (ch == '}'){
                if(st.isEmpty() || st.peek() != '{'){
                    return false;
                }
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}