class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int result[] = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (set.contains(grid[i][j])) {
                    result[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }
        for (int i = 0; i <= n * n; i++) {
            if (!set.contains(i)) {
                result[1] = i;
            }
        }
        return result;
    }
}
