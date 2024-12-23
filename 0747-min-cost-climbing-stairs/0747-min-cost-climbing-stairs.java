class Solution {

    public int minCostClimbingStairs(int[] cost) {
        //build a dp array foor min for each step
        //min cose to reach index i
        int n = cost.length;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
