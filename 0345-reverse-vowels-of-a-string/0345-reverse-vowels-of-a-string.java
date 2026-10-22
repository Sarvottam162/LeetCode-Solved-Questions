class Solution {
    public String reverseVowels(String s) {
        String vowel = "aeiouAEIOU";
        int n = s.length();
        char[] arr  = s.toCharArray();

        int low = 0;
        int high = n - 1;
        while(low < high){
            char chLow = arr[low];
            char chHigh = arr[high];
            if(vowel.indexOf(chLow) != -1 && vowel.indexOf(chHigh) != -1  ){
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
            else if(vowel.indexOf(arr[low]) == -1 && vowel.indexOf(arr[high]) != -1){
                low++;
            }
            else {
                high--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<n; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}