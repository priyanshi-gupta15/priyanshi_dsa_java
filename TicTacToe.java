import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize board
        for (char[] row : board) {
            for (int i = 0; i < row.length; i++) {
                row[i] = ' ';
            }
        }

        char player = 'X';
        boolean gameover = false;
        try (Scanner scanner = new Scanner(System.in)) {
            while (!gameover) {
                printBoard(board);
                System.out.println("Player " + player + ", enter your move (row and column): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                
                // Validate input
                if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                    System.out.println("Invalid input. Try again.");
                    continue;
                }
                
                if (board[row][col] == ' ') {
                    board[row][col] = player;
                    
                    if (haveWon(board, player)) {
                        printBoard(board);
                        System.out.println("Player " + player + " has won!");
                        gameover = true;
                    } else if (isDraw(board)) {
                        printBoard(board);
                        System.out.println("It's a draw!");
                        gameover = true;
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Cell already taken, try again.");
                }
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("  0   1   2");
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col < board[row].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < board.length - 1) {
                System.out.println("  -----");
            }
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        // Rows
        for (char[] row : board) {
            if (row[0] == player && row[1] == player && row[2] == player) return true;
        }

        // Columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player &&
                board[1][col] == player &&
                board[2][col] == player) return true;
        }

        // Diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public static boolean isDraw(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }
}
