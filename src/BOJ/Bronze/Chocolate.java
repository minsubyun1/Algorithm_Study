package BOJ.Bronze;

import java.util.Scanner;
public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 최소 쪼개기 횟수 계산
        System.out.println(N * M -1);

    }
}
