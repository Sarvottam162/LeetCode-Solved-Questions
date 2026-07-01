/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        // m is row and n is col
        int[][] mat = new int[m][n];
        ListNode temp = head;

        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;

        while(true){

            // left to right
            for(int i = left; i<= right; i++){
                if(temp != null){
                    mat[top][i] = temp.val;
                    temp = temp.next;
                }
                else{
                    mat[top][i] = -1;
                }
            }
            top++;
            if(top>bottom || left > right) break;

            //top to bottom

            for(int i = top; i<= bottom; i++){

                if(temp != null){
                    mat[i][right] = temp.val;
                    temp = temp.next;
                }
                else{
                    mat[i][right] = -1;
                }
            }
            right--;
            if(top>bottom || left > right) break;

            //right to left

            for(int i = right; i>= left; i--){
                 if(temp != null){
                    mat[bottom][i] = temp.val;
                    temp = temp.next;
                }
                else{
                    mat[bottom][i] = -1;
                }
            }
            bottom--;
            if(top>bottom || left > right) break;

            // bottom to top

            for(int i = bottom; i>=top;i--){
                 if(temp != null){
                    mat[i][left] = temp.val;
                    temp = temp.next;
                }
                else{
                    mat[i][left] = -1;
                }
            }
            left++;
        }
        return mat;
    }
}