class Solution {

    public boolean isValidSudoku(char[][] board) {
        //if same char exists in the same row or column

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (isInvalid(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isInvalid(int row, int col, char[][] board) {
        //check vertically
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == board[row][col] && i != row) {
                return true;
            }
        }
        //check horizonatlly
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == board[row][col] && j != col) {
                return true;
            }
        }
        // Check the 3x3 sub-box
        int boxStartRow = (row / 3) * 3;
        int boxStartCol = (col / 3) * 3;
        for (int i = boxStartRow; i < boxStartRow + 3; i++) {
            for (int j = boxStartCol; j < boxStartCol + 3; j++) {
                if ((i != row || j != col) && board[i][j] == board[row][col]) {
                    return true;
                }
            }
        }
        return false;
    }
}
