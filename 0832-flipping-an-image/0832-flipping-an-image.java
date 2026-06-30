// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
//         int n = image.length;

//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<n/2; j++){
//                 int temp = image[i][j];
//                 image[i][j] = image[i][n - j - 1];
//                 image[i][n - j - 1] = temp;
//             }
//         }

//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<n; j++){
//                image[i][j] = image[i][j] ^ 1;
//             }
//         }
//         return image;
//     }
// }


//by using an extra space res array both uper and lower solution is correct in upper we change everything in same array in lower we make new res arr 


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        int[][] res = new int[n][n];

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                res[i][j] = image[i][n - j - 1] ^ 1;
            }
        }
        return res;

    }
}

