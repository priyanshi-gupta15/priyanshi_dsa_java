public class n_queens {
  public static void main(String[] args) {
    int n = 5; // Size of the chessboard
    boolean[][] board = new boolean[n][n]; // Array to store the position of queens
    System.out.println(solveNQueens(board, 0));
  }

  static int solveNQueens(boolean[][] board, int row) {
    // Base case: if all queens are placed
    if (row == board.length) {
      printSolution(board);
      return 1;
    }

    int count = 0;

    for (int col = 0; col < board.length; col++) {
      // Check if placing a queen at (row, col) is safe
      if (isSafe(board, row, col)) {
        board[row][col] = true;
        count += solveNQueens(board, row + 1); // Recur to place the next queen
        board[row][col] = false; // Backtrack
      }

    }
    return count;
  }
   
static void printSolution(boolean[][] board) {

   for(boolean[] row : board) {
      for (boolean cell : row) {
        System.out.print(cell ? " Q " : " X ");
      }
      System.out.println();
    }
    System.out.println();
}
  
  static boolean isSafe(boolean [][] board,int row,int col)
  {
    //check for vertical
    for(int i=0;i<row;i++)
    {
      if(board[i][col]) {
        return false; // There is a queen in the same column
      }
    }
    //check for horizontal
    for(int i=0;i<col;i++)
    {
      if (board[row][i]) {
        return false; // There is a queen in the same column
      }
    }
    //check diagonally right
    for(int i=row,j=col;i>=0 && j<board.length;i--,j++)
    {
      if (board[i][j]) {
        return false; // There is a queen in the right diagonal
      }
    }
    //diagonal left
    for(int i=row,j=col;i>=0 && j>=0;i--,j--)
    {
      if (board[i][j]) {
        return false; // There is a queen in the left diagonal
      }
    }
    return true; // Safe to place the queen

  }

  

}
