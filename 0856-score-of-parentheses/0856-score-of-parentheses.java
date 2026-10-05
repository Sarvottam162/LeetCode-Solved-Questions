class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(0);
            } 
            else {
                int inside = st.pop();

                int score = (inside == 0) ? 1 : 2 * inside;

                st.push(st.pop() + score);
            }
        }

        return st.pop();
    }
}