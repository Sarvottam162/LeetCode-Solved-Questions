
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // Case 1: Already sorted
        boolean sorted = true;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) return 0;

        // Case 2: Unsorted string of length 2
        if (n == 2) return -1;

        char min = 'z';
        char max = 'a';

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        // Case 3: One operation
        if (s.charAt(0) == min ||
            s.charAt(n - 1) == max) {
            return 1;
        }

        // Case 4: Two operations
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min ||
                s.charAt(i) == max) {
                return 2;
            }
        }

        // Case 5: Three operations
        return 3;
    }
}


// learn gpt