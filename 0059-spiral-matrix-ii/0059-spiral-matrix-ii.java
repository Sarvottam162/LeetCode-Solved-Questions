class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int row = matrix.length;
        int col = matrix[0].length;
        
        int top = 0;
        int left = 0;
        int right = col - 1;
        int bottom = row - 1;
        int num = 1;
       while(true){
            // left to right
        for(int i = left; i<= right; i++){
            matrix[top][i] = num;
            num++;
        }
        top++;

        if(left > right || top > bottom) break;

        // top to bottom

        for(int i = top; i<= bottom; i++){
            matrix[i][right] = num;
            num++;
        }
        right--;

        if(left > right || top > bottom) break;

        // right to left

        for(int i = right; i>= left; i--){
           matrix[bottom][i] = num;
           num++;
        }
        bottom--;
         if(left > right || top > bottom) break;

         // bottom to top

        for(int i = bottom; i>= top; i--){
            matrix[i][left] = num;
            num++;
        }
        left++;
       }    
       return matrix;   
    }
}