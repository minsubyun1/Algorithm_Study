package BOJ.Silver;

import java.util.Scanner;
public class NM3 {
    static int[] sequence;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M];

        StringBuilder sb = new StringBuilder(); // 출력 최적화 위해서 StringBuilder 사용
        dfs(0, sb);
        System.out.println(sb.toString()); // 최종 결과를 한 번에 출력
    }


    static void dfs(int depth, StringBuilder sb){
        if(depth == M){
            for (int num : sequence) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            sequence[depth] = i;
            dfs(depth + 1, sb);
        }
    }

}
