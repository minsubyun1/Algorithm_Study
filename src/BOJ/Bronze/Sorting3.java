package BOJ.Bronze;

import java.io.*;

public class Sorting3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 수의 개수
        int[] count = new int[10001]; // 각 숫자의 등장 횟수를 저장하는 배열

        // 입력 처리 및 카운팅
        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        // 결과 출력
        for (int i = 1; i < count.length; i++) {
            while(count[i] > 0){
                bw.write(i + "\n");
                count[i]--;
            }
        }

        bw.flush(); // 출력 버퍼 비우기
        bw.close();
    }
}
