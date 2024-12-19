class Solution {
    int m, n;

    public int numDistinct(String s, String t) {
        m = s.length();
        n = t.length();
        int memo[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return helper(s, t, 0, 0, memo);
    }

    private int helper(String s, String t, int i, int j, int memo[][]) {
        int count = 0;
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if (m - i < n - j) return 0;
        if (memo[i][j] != -1) return memo[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            count += helper(s, t, i + 1, j + 1, memo);
        }
        count += helper(s, t, i + 1, j, memo);
        memo[i][j] = count;
        return count;
    }
}
