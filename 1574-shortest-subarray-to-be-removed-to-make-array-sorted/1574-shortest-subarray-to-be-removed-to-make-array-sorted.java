class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int i; 
        int j = n - 1;

        for(i = 0; i<n -1; i++ ){
            if(arr[i] > arr[i+1]){
                break;
            }
        }
        for( ; j > 0; j-- ){
            if (arr[j - 1] > arr[j]) {
            break;
        }
        }
        if (i == n - 1) return 0;
        int start = 0;
        int end = j;
        int min = Math.min(n - i - 1, j);

        while(start <= i && end < n){
            if(arr[start] <= arr[end]){
           min = Math.min(min, end - start - 1);
            start++;
            }
            else{
                end++;
            }
        }
        return min;
    }
}