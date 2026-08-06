class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> fl = new ArrayList<>();
        List<Integer> li =new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0 ; i<n-1; i++){
            min = Math.min((arr[i+1]-arr[i]) , min);
        }
        for(int i = 0 ; i<n-1; i++){
            if(arr[i+1] - arr[i] == min){
                li.add(arr[i]);
                li.add(arr[i+1]);
            }
            if(li.size() > 0){
                fl.add(new ArrayList<>(li));
                li =new ArrayList<>();
            }
        }
        return fl;

        

    }
}