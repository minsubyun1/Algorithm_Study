package BOJ.Silver;

import java.util.*;
public class FourSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int[] D = new int[N + 1];
        D[0] = 0;
        D[1] = 1;
        for (int i = 2; i <= N; i++) {
            D[i] = i; // 최악의 경우 (1^2 + 1^2 + --- + 1^2)로 i개 필요
            for (int j = 1; j * j <= i ; j++) { // j는 가능한 제곱수 (1, 4, 9, ...)
                D[i] = Math.min(D[i], D[i - j * j] + 1);
            }
        }

        System.out.println(D[N]); // 최소 개수 출력

    }
}
