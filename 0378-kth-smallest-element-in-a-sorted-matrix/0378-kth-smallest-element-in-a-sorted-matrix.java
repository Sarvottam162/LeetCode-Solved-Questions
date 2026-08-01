class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        // // method 1 
        // ArrayList<Integer> li = new ArrayList<>();
        // int n = matrix.length;
        // for(int i = 0 ; i<n ; i++){
        //     for(int j = 0; j<n; j++){
        //         li.add(matrix[i][j]);
        //     }
        // }
        // Collections.sort(li);
        // return li.get(k - 1);

        //method 2

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                pq.add(matrix[i][j]);
                if(pq.size() > k){
                    pq.remove();
                }
            }
        }
        return pq.peek();

   }
}


        // method 2 (chatGpt Binary search on answer)


//     class Solution {

//     public int kthSmallest(int[][] matrix, int k) {

//         int n = matrix.length;

//         int low = matrix[0][0];
//         int high = matrix[n - 1][n - 1];

//         while (low < high) {

//             int mid = low + (high - low) / 2;

//             if (countLessEqual(matrix, mid) < k) {
//                 low = mid + 1;
//             } else {
//                 high = mid;
//             }
//         }

//         return low;
//     }

//     private int countLessEqual(int[][] matrix, int mid) {

//         int n = matrix.length;
//         int row = n - 1;
//         int col = 0;
//         int count = 0;

//         while (row >= 0 && col < n) {

//             if (matrix[row][col] <= mid) {

//                 // All elements above are also <= mid
//                 count += row + 1;
//                 col++;

//             } else {

//                 row--;
//             }
//         }

//         return count;
//     }
// }