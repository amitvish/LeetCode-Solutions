class Solution {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int memo[][] = new int[m][n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            memo[i][0] = matrix[i][0] - '0';
            max = Math.max(max, memo[i][0]);
        }

        for (int j = 0; j < n; j++) {
            memo[0][j] = matrix[0][j] - '0';
            max = Math.max(max, memo[0][j]);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    memo[i][j] = 1 + Math.min(memo[i - 1][j - 1],
                     Math.min(memo[i - 1][j], memo[i][j - 1]));
                    max = Math.max(max, memo[i][j]);
                } else {
                    memo[i][j] = 0;
                }
            }
        }
        return max * max;
    }
}
