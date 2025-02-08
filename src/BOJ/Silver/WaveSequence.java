package BOJ.Silver;

import java.util.Scanner;
public class WaveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        long[] dp = new long[101]; // 1 ≤ N ≤ 100 이므로 충분한 크기

        // 초기값 설정
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        // DP 배열 미리 채우기 (Bottom-Up)
        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        // 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            System.out.println(dp[N]);
        }

        sc.close();
    }
}
