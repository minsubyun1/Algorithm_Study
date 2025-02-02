package BOJ.Silver;

import java.io.*;
import java.util.StringTokenizer;

public class FibonacciFunction {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        int[][] dp = new int[41][2]; // 0~40까지의 0과 1의 출력 횟수 저장

        dp[0][0] = 1; // fibonacci(0) 호출 시 0이 1번 출력됨
        dp[0][1] = 0; // fibonacci(0) 호출 시 1이 0번 출력됨
        dp[1][0] = 0; // fibonacci(1) 호출 시 0이 0번 출력됨
        dp[1][1] = 1; // fibonacci(1) 호출 시 1이 1번 출력됨

        // DP 테이블 채우기
        for (int i = 2; i <= 40; i++){
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
        }

        System.out.print(sb);
    }


}

