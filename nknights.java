public class nknights {

  public static void main(String[] args) {
    int n = 5; // Number of knights
    boolean[][] board = new boolean[n][n]; // n x n chessboard
    int count = knights(n, 0, 0, board);
    System.out.println("Total ways to place " + n + " knights: " + count);
  }

  static int knights(int knightsRemaining, int row, int col, boolean[][] board) {
    if (knightsRemaining == 0) {
      printSolution(board);
      return 1;
    }

    if (row == board.length) {
      return 0;
    }

    if (col == board.length) {
      return knights(knightsRemaining, row + 1, 0, board);
    }

    int count = 0;

    if (issafe(board, row, col)) {
      board[row][col] = true;
      count += knights(knightsRemaining - 1, row, col + 1, board);
      board[row][col] = false; // backtrack
    }

    count += knights(knightsRemaining, row, col + 1, board);

    return count;
  }

  static boolean issafe(boolean[][] board, int row, int col) {
    if (isvalid(board, row - 2, col - 1) && board[row - 2][col - 1]) return false;
    if (isvalid(board, row - 2, col + 1) && board[row - 2][col + 1]) return false;
    if (isvalid(board, row - 1, col - 2) && board[row - 1][col - 2]) return false;
    if (isvalid(board, row - 1, col + 2) && board[row - 1][col + 2]) return false;
    return true;
  }

  static boolean isvalid(boolean[][] board, int row, int col) {
    return row >= 0 && row < board.length && col >= 0 && col < board.length;
  }

  static void printSolution(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean cell : row) {
        System.out.print(cell ? " K " : " . ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
