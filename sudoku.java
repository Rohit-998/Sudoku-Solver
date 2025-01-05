
import java.util.Scanner;
public class sudoku {

    public static boolean isSafe(char[][] board, int row, int col, int num) {
        char charNum = (char) (num + '0');

        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == charNum || board[j][col] == charNum) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int r = sr; r < sr + 3; r++) {
            for (int c = sc; c < sc + 3; c++) {
                if (board[r][c] == charNum) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow = 0, ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }
                    board[row][col] = '.'; 
                }
            }
        }
        return false;
    }

    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void printBoard(char[][] board) {
        System.out.print("\n+-------+-------+-------+");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print("\n|-------+-------+-------|");
            }
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.printf("%c ", board[i][j]);
            }
            System.out.print("|");
        }
        System.out.print("\n+-------+-------+-------+\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[9][9];

        System.out.println("Enter the Sudoku puzzle row by row, using '.' for empty cells:");
        for (int i = 0; i < 9; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        System.out.println("Original Sudoku Board:");
        printBoard(board);

        if (helper(board, 0, 0)) {
            System.out.println("Solved Sudoku Board:");
            printBoard(board);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }

        
    }
}


