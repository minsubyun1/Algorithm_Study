package BOJ.Silver;

import java.util.Scanner;
public class Coin0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int K = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // 그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0;
        for (int i = N-1; i >= 0; i--) {
            if(arr[i] <= K){
                count += (K / arr[i]);
                K = K % arr[i];
            }
        }

        System.out.println(count);
    }
}
