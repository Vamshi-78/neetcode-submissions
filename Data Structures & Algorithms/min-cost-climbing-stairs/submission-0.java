class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int f=cost[0];
        int sec=cost[1];
        for(int i=2;i<n;i++){
            int curr=cost[i]+Math.min(f,sec);
            f=sec;
            sec=curr;
        }
        return Math.min(f,sec);
    }
}
