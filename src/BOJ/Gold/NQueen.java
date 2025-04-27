package BOJ.Gold;

import java.util.Scanner;

public class NQueen {
    static int N;
    static int count = 0;
    static boolean[] col; // 같은 열 체크
    static boolean[] diag1; // 오른쪽 아래 대각선 체크 (row + col)
    static boolean[] diag2; // 왼쪽 아래 대각선 체크 (row - col + N - 1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        col = new boolean[N];
        diag1 = new boolean[2 * N - 1];
        diag2 =  new boolean[2 * N - 1];

        dfs(0); // 0번째 행부터 시작


        System.out.println(count);
    }

    static void dfs(int row) {
        if (row == N){
            count++;
            return;
        }

        for (int c = 0; c < N; c++) {
            if (col[c]|| diag1[row + c] || diag2[row - c + N - 1]){
                continue; // 충돌
            }

            // 퀸 놓기
            col[c] = true;
            diag1[row + c] = true;
            diag2[row - c + N - 1] = true;

            dfs( row + 1);

            // 놓았던 퀸 빼기 (백트래킹)
            col[c] = false;
            diag1[row + c] = false;
            diag2[row - c + N - 1] = false;
        }
    }
}
