class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        //find 1s do sum, maintain max
        int row = grid.length;
        int col = grid[0].length;
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    maxSum = Math.max(dfs(grid, i, j), maxSum);
                }
            }
        }
        return maxSum;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        int sum = 1;
        sum += dfs(grid, i + 1, j);
        sum += dfs(grid, i - 1, j);
        sum += dfs(grid, i, j + 1);
        sum += dfs(grid, i, j - 1);
        return sum;
    }
}
