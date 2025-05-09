class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for (int arr[] : dp) Arrays.fill(arr, -1);
        return helper(text1, text2, 0, 0, dp);
    }

    private int helper(String text1, String text2, int i, int j, int dp[][]) {
        if (i == text1.length() || j == text2.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + helper(text1, text2, i + 1, j + 1, dp);
        } else {
            return dp[i][j] = Math.max(helper(text1, text2, i + 1, j, dp), helper(text1, text2, i, j + 1, dp));
        }
    }
}
