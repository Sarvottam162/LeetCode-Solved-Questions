// class Solution {
//     public boolean canJump(int[] nums) {
//         int n = nums.length;
//         return solve(nums , 0 , n - 1);
//     }

//     public boolean solve(int[] nums , int si , int ei){

//         if(ei == si) return true;

//         for(int i = 1; i<= nums[si]; i++){
//             if(solve(nums , si + i , ei) == true) return true;
//         }
//         return false;
//     }
// }

// came TLE Solve using DP

// greedy

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxJump = 0;


        for(int i = 0 ; i<n; i++){
            if( i > maxJump) return false;
            maxJump = Math.max(maxJump , i + nums[i]);
        }
        return true;
    }
}