package BOJ.Silver;

import java.util.Scanner;
public class Bridge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(combination(M, N));
        }
    }

    public static long combination(int M, int N){
        long result = 1;

        for (int i = 0; i < N; i++){
            result *= (M - i);
            result /= (i + 1);
        }
        return result;
    }
}
