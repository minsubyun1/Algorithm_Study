package BOJ.Silver;

import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] testCases = new int[N];
        int maxN = 0;

        // 테스트 케이스 입력 및 최대값 계산
        for (int i = 0; i < N; i++) {
            testCases[i] = sc.nextInt();
            maxN = Math.max(maxN, testCases[i]);
        }

        // DP 배열 생성 및 초기화
        int[] dp = new int[maxN + 1];

        dp[1] = 1; // 1을 만드는 방법 1 한 개
        if(maxN >= 2) {
            dp[2] = 2; // 2를 만드는 방법 1+1, 2
        }
        if(maxN >= 3){
            dp[3] = 4; // 3을 만드는 방법: 1+1+1, 1+2, 2+1, 3
        }

        // DP 점화식 계산
        for (int i = 4; i <= maxN; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }


        // 결과 출력
        for (int n : testCases) {
            System.out.println(dp[n]);
        }

        sc.close();
    }
}
