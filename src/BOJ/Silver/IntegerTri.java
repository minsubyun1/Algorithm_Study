package BOJ.Silver;

import java.util.Scanner;
public class IntegerTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] triangle = new int[N][N];
        int[][] dp = new int[N][N];

        // 삼각형
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = sc.nextInt();
            }
        }

        // 맨 꼭대기 초기화
        dp[0][0] = triangle[0][0];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if (j == i){
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }

        // 마지막 줄 중 최대값이 정답
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, dp[N - 1][i]);
        }

        System.out.println(answer);
    }
}
