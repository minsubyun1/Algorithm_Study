package BOJ.Silver;

import java.io.*;
import java.util.*;

public class Bogus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> dhs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            dhs.add(br.readLine());
        }

        // TreeSet 활용하여 듣보잡 명단을 자동 정렬
        TreeSet<String> dnhs = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            String dns = br.readLine();
            if (dhs.contains(dns)){
                dnhs.add(dns);
            }
        }

        // 결과 출력 최적화
        bw.write(dnhs.size() + "\n");
        for (String name : dnhs) {
            bw.write(name + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
