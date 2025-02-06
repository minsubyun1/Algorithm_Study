package BOJ.Silver;

import java.util.HashMap;
import java.util.Scanner;
public class Fashoin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            HashMap<String, Integer> map = new HashMap<>();

            int M = sc.nextInt();


            for (int j = 0; j < M; j++){
                sc.next(); // 의상 이름 (사용하지 않음)
                String type = sc.next(); // 의상 종류

                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int result = 1;

            for (int count : map.values()){
                result *= (count + 1);
            }

            System.out.println(result - 1);
        }
    }
}
