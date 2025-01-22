package BOJ.Silver;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Solvedac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());

        if (N == 0){
            bw.write("0\n"); // 의견이 없을 때
            bw.flush();
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine().trim());
        }


        Arrays.sort(arr); // 정렬

        int intercepts = (int) Math.round(N * 0.15); // 제외할 개수
        long sum = 0;

        // 절사된 값의 합 계산
        for (int i = intercepts; i < N - intercepts; i++){
            sum += arr[i];
        }

        // 평균 계산 후 출력
        int count = N - 2 * intercepts; // 유효한 값의 개수
        System.out.println(Math.round((double) sum / count));
    }
}
