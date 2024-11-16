package BOJ.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = 0; // M 이하에서의 최대 합

        // 3장의 카드를 선택하는 모든 경우 탐색
        for(int i = 0; i < N - 2; i++){
            for(int j = i; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    int sum = arr[i] + arr[j] + arr[k];

                    // 합이 M 이하이고, 이전 최대값보다 큰 경우 갱신
                    if (sum <= M && sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
}
