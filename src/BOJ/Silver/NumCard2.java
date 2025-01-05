package BOJ.Silver;

import java.util.*;
import java.io.*;
public class NumCard2 {
    public static void main(String[] args) throws IOException{
        // 입력값의 범위가 넓기에 빠른 입출력을 위해 버퍼 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1); // getOrDefault로 간결화
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++){
            int conf_num = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(conf_num, 0)).append(" ");
        }

        bw.write(sb.toString().trim()); // 결과를 StringBuilder에 저장 후 한 번에 출력
        bw.flush();
        bw.close();
    }

}

