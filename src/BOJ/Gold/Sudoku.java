package BOJ.Gold;

import java.util.Scanner;
public class Sudoku {
    static int[][] board = new int[9][9];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        solve(0, 0);
    }

    public static void solve(int row, int col){
        if (col == 9) {
            solve(row + 1, 0);
            return;
        }

        if (row == 9) {
            printBoard();
            System.exit(0);
        }

        if (board[row][col] == 0){
            for (int num = 1; num <= 9; num++) {
                if(isValid(row, col, num)){
                    board[row][col] = num;
                    solve(row, col + 1);
                    board[row][col] = 0; // 백트래킹
                }
            }
        } else {
            solve(row, col + 1);
        }
    }

    public static boolean isValid(int row, int col, int num) {
        // 행과 열 체크
        for (int i = 0; i < 9; i++) {
            if(board[row][i] == num || board[i][col] == num){
                return false;
            }
        }

        // 3x3 체크
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num){
                    return false;
                }
            }
        }

        return true;

    }

    public static void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
