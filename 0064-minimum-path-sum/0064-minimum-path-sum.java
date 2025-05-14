class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //create dp table to store min sum path from top left
        int memo[][] = new int[m][n];
        memo[0][0] = grid[0][0]; //to reach top left needs grid[0][0];

        //fill top row
        for(int i = 1; i < m; i++){
            memo[i][0] = memo[i-1][0] + grid[i][0];
        }

        //fill left row
        for(int j = 1; j < n; j++){
            memo[0][j] = memo[0][j-1] + grid[0][j];
        }

        // fill rest of grid
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                memo[i][j] = Math.min(memo[i-1][j], memo[i][j-1]) + grid[i][j];
            }
        }
        return memo[m-1][n-1];
    }
}