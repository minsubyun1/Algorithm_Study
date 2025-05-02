package BOJ.Silver;

import java.util.ArrayList;
import java.util.Scanner;
public class StartAndLink {
    static int[][] map;
    static int N;
    static boolean[] visited; // 팀 구분
    static int minDiff = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N];



        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        combine(0, 0); // idx 0부터, 현재 뽑은 인원 수 0

        System.out.println(minDiff);
    }

    static void combine(int idx, int depth) {
        if (depth == N / 2) {
            calculateDiff();
            return;
        }

        for (int i = idx; i < N; i++) {
            visited[i] = true;
            combine(i + 1, depth + 1);
            visited[i] = false;
        }
    }

    static void calculateDiff() {
        int startSum = 0;
        int linkSum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]){
                    startSum += map[i][j] + map[j][i];
                } else if (!visited[i] && !visited[j]){
                    linkSum += map[i][j] + map[j][i];
                }
            }
        }

        int diff = Math.abs(startSum - linkSum);
        minDiff = Math.min(minDiff, diff);

        // 가지치기 최적화 (0이면 최적이니 종료)
        if (minDiff == 0) {
            System.out.println(0);
            System.exit(0);
        }
    }
}
