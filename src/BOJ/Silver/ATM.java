package BOJ.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

        }
        // 인출 시간 오름차순 정렬
        Arrays.sort(arr);

        int total = 0; // 전체 대기 시간 합
        int waitingTime = 0; // 현재 사람까지의 대기 시간

        for (int time : arr) {
            waitingTime += time;
            total += waitingTime;
        }

        // 결과
        System.out.println(total);


    }
}
