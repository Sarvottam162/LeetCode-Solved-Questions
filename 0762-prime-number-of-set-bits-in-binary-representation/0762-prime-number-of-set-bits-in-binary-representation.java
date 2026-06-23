class Solution {
    public boolean isPrime(int n){
        if( n < 2) return false;
       for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {

        int count = 0;

        for(int i = left; i<=right; i++){
            int temp = i;
            int count1 = 0;;
            while(temp != 0){
                if(temp % 2 == 1)count1++;
                temp /= 2;
            }
            if(isPrime(count1)) count++;
        }
        return count;
        
    }
}