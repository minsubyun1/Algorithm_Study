package BOJ.Silver;

import java.util.Scanner;
public class CuttingLAN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[K];
        long max = 0;

        // 입력받으면서 최대 길이 저장
        for (int i = 0; i < K; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }

        long low = 1; // 최소 길이
        long high = max; // 최대 길이
        long result = 0;

        while (low <= high){
            long mid = (low + high) / 2;
            long count = 0;

            // 현재 mid 길이로 자를 수 있는 랜선
            for (int i = 0; i < K; i++){
                count += arr[i] / mid;
            }

            if (count >= N){
                result = mid; // 현재 길이를 정답 후보로 등록
                low = mid + 1; // 더 긴 길이로 탐색
            } else {
                high = mid - 1; // 충족하지 못한 경우 더 짧은 길이를 탐색
            }
        }
        System.out.println(result);
    }
}
