class Solution {
    public String[] createGrid(int m, int n) {
        int row = m;
        int col = n;
        String[][] grid = new String[row][col];

        // for(int i = 0; i< row; i++){
        //     grid[0][i] = ".";
        // }
        // for(int i = 0; i< row; i++){
        //     grid[i][col - 1] = ".";
        // }

        for(int i = 0; i<row; i++){
            for(int j = 0; j < col; j++){
                if( i == 0){
                    grid[i][j] = ".";
                }
                else if(j == col - 1){
                    grid[i][j] = ".";
                }
                else{
                    grid[i][j] = "#";
                }
            }
        }
        String[] res = new String[row];
        int k = 0;

        for(int i = 0; i<row; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < col; j++){
                sb.append(grid[i][j]);
            }
            res[k] = sb.toString();
            k++;
        }
        return res;
        
    }
}