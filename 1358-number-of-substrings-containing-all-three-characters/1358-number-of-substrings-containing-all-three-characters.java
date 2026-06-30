// class Solution {
//     public int numberOfSubstrings(String s) {
//         int n = s.length();
//         int count = 0;
//         for(int i = 0; i<n; i++){
//             boolean hasA = false;
//             boolean hasB = false;
//             boolean hasC = false;
//             for(int j = i; j<n; j++){
//                 char ch = s.charAt(j);
//                 if(ch == 'a') hasA = true;
//                 if(ch == 'b') hasB = true;
//                 if(ch == 'c') hasC = true;
//             if(hasA && hasB && hasC) count++;
//             }
//         }
//         return count;
//     }
// }

// in my code it give TLE testcase pass(48/54);

// chatgpt method 

class Solution {
    public int numberOfSubstrings(String s) {

        int lastA = -1;
        int lastB = -1;
        int lastC = -1;

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') lastA = i;
            else if (ch == 'b') lastB = i;
            else lastC = i;

            ans += Math.min(lastA, Math.min(lastB, lastC)) + 1;
        }

        return ans;
    }
}