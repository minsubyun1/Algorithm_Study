import java.util.HashMap;

public class 모음사전 {
    public static void main(String[] args) {
        String word = "I";

        String[] alphabet = {"A", "E", "I", "O", "U"};

        HashMap<String, Integer> alphabet_map = new HashMap<>();

        for (int i = 0; i < alphabet.length; i++) {
            alphabet_map.put(alphabet[i], i);
        }

        // 자리수 가중치
        int[] weights = {781, 156, 31, 6, 1};
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            String ch = String.valueOf(word.charAt(i));

            int index = alphabet_map.get(ch);
            answer += index * weights[i];
        }



        System.out.println(answer + word.length());
    }
}