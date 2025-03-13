package BOJ.Bronze;

import java.util.Scanner;
public class PuttingBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int k  = sc.nextInt();
            for (int j = start - 1; j < end; j++) {
                arr[j] = k;
            }
        }

        for (int ball : arr) {
            System.out.print(ball + " ");
        }
    }
}
