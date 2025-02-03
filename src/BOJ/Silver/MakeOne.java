package BOJ.Silver;

import java.util.Scanner;
public class MakeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int[] dp = new int[N + 1];

        // DP 초기화
        dp[1] = 0; // 1은 이미 1이므로 연산 필요 없음.

        for (int i = 2; i <= N; i++) {
            // 기본적으로 1을 빼는 연산 (dp[i-1] + 1)
            dp[i] = dp[i - 1] + 1;

            // 2로 나누어 떨어질 때
            if (i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3으로 나누어 떨어질 때
            if (i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}
