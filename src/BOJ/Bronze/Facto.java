package BOJ.Bronze;

import java.util.Scanner;
public class Facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int total = 1;

        for(int i = 1; i <= N; i++){
            total *= i;
        }

        System.out.println(total);
    }
}
