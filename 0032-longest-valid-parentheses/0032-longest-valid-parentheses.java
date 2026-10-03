
//Brute Force -- tle
// class Solution {
    
//     public boolean isValid(int i ,int j,String s){

//         Stack<Character> st = new Stack<>();
//         int n = s.length();

//         for(; i<=j; i++){
//             char ch = s.charAt(i);
//             if(ch ==')'){
//                 if(st.isEmpty() || st.peek() != '(' ){
//                     return false;
//                 }
//                 st.pop();
//             }
//             else{
//                 st.push(ch);
//             }
//         }
//         return st.isEmpty() ? true : false;
//     }




//     public int longestValidParentheses(String s) {
//         int max = 0;
//         int n = s.length();

//         for(int i = 0; i<n; i++){
//             for(int j = i; j<n; j++){
//                 boolean isvalid = isValid(i,j,s);
//                 if(isvalid){
//                     max = Math.max(max, j - i + 1);
//                 }
//             } 
//         }
//         return max;
//     }
// }


// optimse using only stack

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                st.push(i);

            } else {

                st.pop();

                if (st.isEmpty()) {
                    st.push(i);
                } 
                else {
                    max = Math.max(max, i - st.peek());
                }
            }
        }

        return max;
    }
}