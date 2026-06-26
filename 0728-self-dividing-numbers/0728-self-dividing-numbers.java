class Solution {
    public boolean check(int n){
        int temp = n;
        while(n > 0){
            int rem = n % 10;
            if(rem == 0) return false;
            if(temp % rem != 0) return false;
            n = n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = left; i<=right; i++){
            if(check(i)) li.add(i);
        }
        return li;
    }
}