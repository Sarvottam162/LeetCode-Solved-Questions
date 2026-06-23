// class Solution {
//     public int numRookCaptures(char[][] board) {

//         int rpi = -1;
//         int rpj = -1;

//         for(int i = 0 ; i<8; i++){
//             for(int j = 0 ; j<8; j++){
//                 if(board[i][j] == 'R'){
//                     rpi = i;
//                     rpj = j;
//                 }
//             }
//             if(rpi != -1 && rpj != -1) break;
//         }

//         if(rpi == -1 && rpj == -1)  return 0;
//         int kills = 0;

//         //up check  for p
//         for(int i = rpi-1 ; i>=0; i--){
//             if(board[i][rpj] == 'p'){
//                 kills++;
//                 break;
//             }
//             else if (board[i][rpj] == 'B'){
//                 break;
//             }
//         }

//         // down check for p

//          for(int i = rpi+1 ; i<8; i++){
//             if(board[i][rpj]  == 'p'){
//                  kills++;
//                 break;
//             }
//             else if (board[i][rpj] == 'B'){
//                 break;
//             }
//         }

//         //left check for p

//          for(int j = rpj-1 ; j>=0; j--){
//             if(board[rpi][j]  == 'p'){
//                  kills++;
//                 break;
//             }
//             else if (board[rpi][j] == 'B'){
//                 break;
//             }
//         }

//          //right check for p

//          for(int j = rpj+1 ; j<8; j++){
//             if(board[rpi][j]  == 'p'){
//                  kills++;
//                 break;
//             }
//             else if (board[rpi][j] == 'B'){
//                 break;
//             }
//         }
// return kills;
//     }
// }


// using function;

class Solution {
    public int count(char[][] board, int row, int col){
        int kills = 0;
        //up
        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'p'){
                kills++; break;
            }
            else if(board[i][col] == 'B') break;
        }
        //down
        for(int i = row+1; i<8; i++){
            if(board[i][col] == 'p'){
                kills++; break;
            }
            else if(board[i][col] == 'B') break;
        }
        //left
        for(int i = col-1; i>=0; i--){
            if(board[row][i] == 'p'){
                kills++; break;
            }
            else if(board[row][i] == 'B') break;
        }
        //right
        for(int i = col+1; i<8; i++){
            if(board[row][i] == 'p'){
                kills++; break;
            }
            else if(board[row][i] == 'B') break;
        }
        return kills;
        
    }
    public int numRookCaptures(char[][] board) {
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(board[i][j] == 'R'){
                    return count(board, i, j); //3,4
                }
            }
        }
        return 0;
    }
}