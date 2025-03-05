package BOJ.Silver;

import java.util.HashSet;
import java.util.Scanner;

public class StringSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        HashSet<String> set = new HashSet<>();


        // 집합 S에 포함된 문자열 저장 (O(N))
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }

        int count = 0;

        // 검사해야 하는 문자열 확인 (O(1) * M)
        for (int i = 0; i < M; i++) {
            if (set.contains(sc.nextLine())){
                count++;
            }
        }

        System.out.println(count);
    }
}
