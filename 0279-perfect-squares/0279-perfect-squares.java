class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n + 1];
        // find min from 1 to n
        //1, 4, 9, 16, 25
        //similar to coin change problem
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            int minCount = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++){
                minCount = Math.min(minCount, dp[i - j*j] + 1);
            }
            dp[i] = minCount;
        }

        return dp[n];
    }
}