class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;
        
        int top = 0;
        int left = 0;
        int right = col - 1;
        int bottom = row - 1;

       while(true){
            // left to right
        for(int i = left; i<= right; i++){
            li.add(matrix[top][i]);
        }
        top++;

        if(left > right || top > bottom) break;

        // top to bottom

        for(int i = top; i<= bottom; i++){
            li.add(matrix[i][right]);
        }
        right--;

        if(left > right || top > bottom) break;

        // right to left

        for(int i = right; i>= left; i--){
            li.add(matrix[bottom][i]);
        }
        bottom--;
         if(left > right || top > bottom) break;

         // bottom to top

        for(int i = bottom; i>= top; i--){
            li.add(matrix[i][left]);
        }
        left++;
       }
       return li;
    }
}