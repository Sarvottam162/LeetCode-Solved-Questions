class Solution {
    public int numRookCaptures(char[][] board) {

        int rpi = -1;
        int rpj = -1;

        for(int i = 0 ; i<8; i++){
            for(int j = 0 ; j<8; j++){
                if(board[i][j] == 'R'){
                    rpi = i;
                    rpj = j;
                }
            }
            if(rpi != -1 && rpj != -1) break;
        }

        if(rpi == -1 && rpj == -1)  return 0;
        int kills = 0;

        //up check  for p
        for(int i = rpi-1 ; i>=0; i--){
            if(board[i][rpj] == 'p'){
                kills++;
                break;
            }
            else if (board[i][rpj] == 'B'){
                break;
            }
        }

        // down check for p

         for(int i = rpi+1 ; i<8; i++){
            if(board[i][rpj]  == 'p'){
                 kills++;
                break;
            }
            else if (board[i][rpj] == 'B'){
                break;
            }
        }

        //left check for p

         for(int j = rpj-1 ; j>=0; j--){
            if(board[rpi][j]  == 'p'){
                 kills++;
                break;
            }
            else if (board[rpi][j] == 'B'){
                break;
            }
        }

         //right check for p

         for(int j = rpj+1 ; j<8; j++){
            if(board[rpi][j]  == 'p'){
                 kills++;
                break;
            }
            else if (board[rpi][j] == 'B'){
                break;
            }
        }
return kills;
    }
}