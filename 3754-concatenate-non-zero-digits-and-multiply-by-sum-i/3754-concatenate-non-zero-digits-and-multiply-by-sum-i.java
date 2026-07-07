class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        long sum = 0;
        while(n != 0){
            long rem = n % 10;
            if(rem != 0){
                num = num * 10 + rem;
                sum += rem;
            }
            n /= 10;
        }
        long rev = 0;
        while(num != 0){
            long rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev * sum;
    }
}