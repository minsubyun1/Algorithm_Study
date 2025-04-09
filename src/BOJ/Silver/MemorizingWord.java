package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MemorizingWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M){
                continue;
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> wordList = new ArrayList<>(map.keySet());

        wordList.sort((w1, w2) -> {
            int freq1 = map.get(w1);
            int freq2 = map.get(w2);

            if(freq1 != freq2) return freq2 - freq1; // 빈도 내림차순
            if(w1.length() != w2.length()) return w2.length() - w1.length(); // 길이 내림차순
            return w1.compareTo(w2); // 사전순 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for (String word : wordList) {
            sb.append(word).append("\n");
        }

        System.out.println(sb);
    }
}
