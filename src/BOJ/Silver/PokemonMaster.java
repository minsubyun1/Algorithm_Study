package BOJ.Silver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PokemonMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<String, Integer> nameToNum = new HashMap<>();
        Map<Integer, String> numToName = new HashMap<>();

        // 포켓몬 도감 입력
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            nameToNum.put(name, i+1);
            numToName.put(i+1, name);
        }

        for(int j = 0; j < M; j++){
            String query = sc.next();
            if(nameToNum.containsKey(query)){
                System.out.println(nameToNum.get(query));
            } else {
                System.out.println(numToName.get(Integer.parseInt(query)));
            }
        }
    }
}
