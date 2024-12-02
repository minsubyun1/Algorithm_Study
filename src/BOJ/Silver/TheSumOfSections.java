package BOJ.Silver;

import java.util.Scanner;
public class TheSumOfSections {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열 크기
        int M = sc.nextInt(); // 질의 개수
        int[] arr = new int[N + 1]; // 원래 배열(1-based index)
        int[] prefixSum = new int[N + 1]; // 누적 합 배열

        // 배열 입력 및 누적 합 계산
        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        // 질의 처리
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(prefixSum[b] - prefixSum[a-1]);
        }
    }
}
