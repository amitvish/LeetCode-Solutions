class Solution {

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int memo[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = 10000;
            }
        }

        //go from top left to bottom right
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    memo[i][j] = 0;
                } else {
                    if (i > 0) {
                        memo[i][j] = Math.min(memo[i][j], memo[i - 1][j] + 1);
                    }
                    if (j > 0) {
                        memo[i][j] = Math.min(memo[i][j], memo[i][j - 1] + 1);
                    }
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 0) {
                    memo[i][j] = 0;
                } else {
                    if (i < m - 1) {
                        memo[i][j] = Math.min(memo[i][j], memo[i + 1][j] + 1);
                    }
                    if (j < n - 1) {
                        memo[i][j] = Math.min(memo[i][j], memo[i][j + 1] + 1);
                    }
                }
            }
        }

        return memo;
    }
}
