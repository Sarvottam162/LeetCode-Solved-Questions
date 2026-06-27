class Solution {
    public int uniquePathsIII(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int sr = -1;
        int sc = -1;
        int er = -1;
        int ec = -1;
        int count = 0;

        for(int i = 0 ; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] != -1) count++;
                if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                }
                if(grid[i][j] == 2){
                    er = i;
                    ec = j;
                }
            }
        }
        return helper(grid , sr, sc, er,ec , count);
    }

    public int helper(int[][] grid , int sr , int sc , int er , int ec, int count){
        int row = grid.length;
        int col = grid[0].length;

        if(sr < 0 || sc < 0) return 0;
        if(sr >= row || sc >= col ) return 0;
        if(grid[sr][sc] == -1) return 0;
        if(grid[sr][sc] == 2) {
            if(count == 1) return 1;
            return 0;
        }
        grid[sr][sc] = -1;

        int right = helper(grid , sr , sc + 1 , er, ec , count -1);
        int left = helper(grid , sr , sc - 1 , er, ec ,count -1);
        int up =  helper(grid , sr - 1 , sc, er, ec, count - 1);
        int down =  helper(grid , sr + 1, sc, er, ec , count -1);
        grid[sr][sc] = 0;

        return right + left + up + down;
    }
}