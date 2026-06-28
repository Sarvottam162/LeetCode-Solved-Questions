class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        int n = matrix.length;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<n; j++){
                li.add(matrix[i][j]);
            }
        }
        Collections.sort(li);
        return li.get(k - 1);
    }
}