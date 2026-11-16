class Solution {
    public String digitSum(String s, int k) {

        int n = s.length();
        StringBuilder sb = new StringBuilder();

        while (n > k) {

            sb = new StringBuilder(); 

            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {

                char ch = s.charAt(i);

                sum += ch - '0';
                count++;

                if (count == k) {
                    sb.append(sum);
                    sum = 0;
                    count = 0;
                }
            }

            // Handle the remaining group
            if (count > 0) {
                sb.append(sum);
            }

            s = sb.toString();
            n = s.length();
        }

        return s;
    }
}