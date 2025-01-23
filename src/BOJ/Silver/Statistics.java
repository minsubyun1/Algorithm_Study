package BOJ.Silver;

import java.util.Arrays;
import java.util.Scanner;
public class Statistics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        // 산술평균
        long sum = 0;

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 정렬
        Arrays.sort(arr);

        double avg = Math.round((double) sum / N);
        System.out.println((int) avg);

        // 중앙값
        int median = arr[N / 2];
        System.out.println(median);

        // 최빈값
        int[] count = new int[8001];
        for (int i = 0; i < N; i++){
            count[arr[i] + 4000]++;
        }

        int maxCount = 0;
        for (int i = 0; i < 8001; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
            }
        }

        // 최빈값이 여러 개인 경우 처리
        int mode = 0;
        boolean foundFirst = false;

        for (int i = 0; i < 8001; i++){
            if(count[i] == maxCount){
                if(!foundFirst){
                    mode = i - 4000;
                    foundFirst = true;
                } else {
                    mode = i - 4000;
                    break; // 두 번째 최빈값 찾으면 종료
                }
            }
        }
        System.out.println(mode);

        // 범위
        int range = arr[N - 1] - arr[0];
        System.out.println(range);
    }
}
