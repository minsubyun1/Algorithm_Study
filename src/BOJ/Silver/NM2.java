package BOJ.Silver;

import java.util.Scanner;

public class NM2 {
    static int[] sequence;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M];

        dfs(0, 1); // 시작 숫자는 1부터
    }

    static void dfs(int depth, int start) {
        if (depth == M) { // M개 선택 완료
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) { // start부터 N까지 탐색
            sequence[depth] = i; // 현재 숫자 선택
            dfs(depth + 1, i + 1); // 다음 단계에서 i보다 큰 숫자만 선택
        }
    }
}
