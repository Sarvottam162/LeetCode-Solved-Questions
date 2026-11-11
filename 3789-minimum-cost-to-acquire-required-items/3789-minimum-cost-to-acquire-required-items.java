class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long pay = 0;
        long minCost = Math.min(costBoth , cost1+cost2);
        long minNeed = Math.min(need1,need2);
        pay += minCost *minNeed;

        long minCost1 = Math.min(costBoth , cost1);
        pay += minCost1 * (need1 - minNeed);
        long minCost2 = Math.min(costBoth , cost2);
        pay += minCost2 * (need2 - minNeed);


        return pay;
    }
}
//solved using Hint