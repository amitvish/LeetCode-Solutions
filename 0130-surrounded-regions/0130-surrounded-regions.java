class Solution {

    public void solve(char[][] board) {
        //find o,s on boundry and do dfs on them
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') boundryDfs(board, i, 0);
            if (board[i][col - 1] == 'O') boundryDfs(board, i, col - 1);
        }
        for (int j = 0; j < col; j++) {
            if (board[0][j] == 'O') boundryDfs(board, 0, j);
            if (board[row - 1][j] == 'O') boundryDfs(board, row - 1, j);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void boundryDfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') return;

        if (board[i][j] == 'O') board[i][j] = '*';

        boundryDfs(board, i + 1, j);
        boundryDfs(board, i - 1, j);
        boundryDfs(board, i, j + 1);
        boundryDfs(board, i, j - 1);
    }
}
