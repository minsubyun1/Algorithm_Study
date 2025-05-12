package BOJ.Silver;

import java.util.Scanner;
public class Sticker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0){
            int N = sc.nextInt();
            int[][] stickers = new int[2][N];
            int[][] dp = new int[2][N];

            // 스티커 점수 입력
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < N; j++) {
                    stickers[i][j] = sc.nextInt();
                }
            }

            // 초기값 설정
            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];

            if (N > 1){
                dp[0][1] = dp[1][0] + stickers[0][1];
                dp[1][1] = dp[0][0] + stickers[1][1];
            }

            // DP 적용
            for (int i = 2; i < N; i++) {
                dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + stickers[0][i];
                dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + stickers[1][i];
            }

            // 마지막 열 중 최대값이 정답
            int answer = Math.max(dp[0][N - 1], dp[1][N - 1]);
            System.out.println(answer);
        }
    }
}
