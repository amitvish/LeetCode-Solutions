class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 2) return nums[0];
        //creata arrray to store max loot at each index
        int dp[] = new int[n];

        //memoize llot at first 2 index
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        //use them to fill complete array
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[n - 1];
    }
}
