
/**
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
public class Task03 {
    private static final int BOARD_SIZE = 8;
    private static int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

    private static boolean canPlaceQueen(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < BOARD_SIZE; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean solve(int row) {
        if (row == BOARD_SIZE) {
            return true;
        }
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (canPlaceQueen(row, i)) {
                board[row][i] = 1;
                if (solve(row + 1)) {
                    return true;
                }
                board[row][i] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        solve(0);
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
