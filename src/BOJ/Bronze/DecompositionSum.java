package BOJ.Bronze;

import java.util.Scanner;

public class DecompositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = 0;

        // 생성자는 (N - 자리수 합)의 최대값에서부터 시작 가능
        // 분해합의 탐색 범위를 줄임.
        // ex) 256 -> 229(256-27)부터 시작해서 찾기.
        for(int i = Math.max(1, N - 9 * String.valueOf(N).length()); i < N; i++){
            int sum = i;
            int num = i;

            // 각 자리수 합 계산
            while(num > 0){
                sum += num % 10; // 각 자리수를 더함
                num /= 10;
            }

            // 분해합이 N과 같으면 가장 작은 생성자 발견
            if(sum == N){
                M = i;
                break;
            }
        }


        System.out.println(M);
    }
}
