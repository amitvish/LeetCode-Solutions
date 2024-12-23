class Solution {

    public int lengthOfLIS(int[] nums) {
        //create 1d dp starting with 1
        int n = nums.length;
        int max = 0;
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        //fill again
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // return the max value in dp array
        for (int k = 0; k < n; k++) {
            if (dp[k] > max) {
                max = dp[k];
            }
        }
        return max;
    }
}
