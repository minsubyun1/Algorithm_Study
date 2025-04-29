package BOJ.Silver;

import java.util.Scanner;
public class InsertOperator {
    static int N;
    static int[] num;
    static int[] operators; // +, -, *, /
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        num = new int[N];
        operators = new int[4];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        dfs(1, num[0]); // 0번째 숫자는 시작 숫자

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int depth, int result) {
        if (depth == N) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                int nextResult = 0;
                if (i == 0) nextResult = result + num[depth];
                else if (i == 1) nextResult = result - num[depth];
                else if (i == 2) nextResult = result * num[depth];
                else if (i == 3) {
                    if (result < 0) {
                        nextResult = -(-result / num[depth]);
                    } else {
                        nextResult = result / num[depth];
                    }
                }

                dfs(depth + 1, nextResult);

                operators[i]++; // 백트래킹: 다시 복구
            }
        }
    }
}
