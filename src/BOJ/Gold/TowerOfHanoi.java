package BOJ.Gold;

import java.util.Scanner;
public class TowerOfHanoi {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        hanoi(N, 1, 3, 2);
        System.out.println(count);
        System.out.println(sb);

    }

    public static void hanoi(int n, int from, int to, int via){
        if (n == 1){
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            return;
        }

        hanoi(n - 1, from, via, to); // 1. n-1개를 via로 옮기기
        sb.append(from).append(" ").append(to).append("\n"); // 가장 큰 원판 옮기기
        count++;
        hanoi(n - 1, via, to, from); // 3. via에서 to로 나머지 옮기기
    }
}
