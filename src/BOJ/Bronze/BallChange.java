package BOJ.Bronze;

import java.util.Scanner;
public class BallChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int fir = sc.nextInt();
            int sec = sc.nextInt();
            int comp = arr[fir];
            arr[fir] = arr[sec];
            arr[sec] = comp;
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(arr[i]);
        }
    }
}
