class Solution {

    public boolean exist(char[][] board, String word) {
        char arr[] = word.toCharArray();
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int i, int j, int index) {
        //base case = if entire word is found
        if (index == word.length()) {
            return true;
        }
        // Boundary and mismatch check
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found =
            backtrack(board, word, i + 1, j, index + 1) || // Down
            backtrack(board, word, i - 1, j, index + 1) || // Up
            backtrack(board, word, i, j + 1, index + 1) || // Right
            backtrack(board, word, i, j - 1, index + 1); // Left

        board[i][j] = temp;
        return found;
    }
}
