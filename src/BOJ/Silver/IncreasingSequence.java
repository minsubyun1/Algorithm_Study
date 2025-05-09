package BOJ.Silver;

import java.util.Scanner;
public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            dp[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if(A[j] < A[i]){
                    // i번째 수를 마지막으로 하는 LIS의 길이를 구하는 로직
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
