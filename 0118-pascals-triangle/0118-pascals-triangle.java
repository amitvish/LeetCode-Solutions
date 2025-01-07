class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //create a matrix
        int matrix[][] = new int[numRows][numRows];
        //fill matric
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][j - 1];
                }
            }
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(matrix[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}
