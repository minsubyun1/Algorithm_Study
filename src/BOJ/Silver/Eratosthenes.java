package BOJ.Silver;

import java.util.Scanner;
public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] isPrime = new boolean[N + 1];
        int count = 0; // 지운 숫자 개수

        for (int i = 2; i <= N; i++) {
            if(!isPrime[i]) { // 소수 발견
                for (int j = i; j <= N; j += i) {
                    if(!isPrime[j]){
                        isPrime[j] = true; // 지운다
                        count++;
                        if (count == K){ // K번째로 지운 수 찾음
                            System.out.println(j);
                            return;
                        }
                    }
                }
            }
        }
    }
}
