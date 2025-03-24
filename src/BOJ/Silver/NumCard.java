package BOJ.Silver;


import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NumCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이가 가지고 있는 숫자 카드의 개수 N
        int N = Integer.parseInt(br.readLine());

        // 숫자 카드들을 HashSet에 저장 (Set은 중복을 허용하지 않음)
        HashSet<Integer> cards = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(st.nextToken())); // 숫자 카드 입력
        }

        // M개의 수
        int M = Integer.parseInt(br.readLine());

        // 주어진 M개의 수가 숫자 카드에 있는지 확인
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(st.nextToken());
            if (cards.contains(query)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        // 결과 출력
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
