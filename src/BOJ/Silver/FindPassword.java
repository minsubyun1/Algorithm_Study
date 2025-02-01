package BOJ.Silver;

import java.io.*;
import java.util.*;
public class FindPassword {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashMap<String, String> memo = new HashMap<>();

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            memo.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < M; i++){
            String address = br.readLine();
            bw.write(memo.get(address) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
