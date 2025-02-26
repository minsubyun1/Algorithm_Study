package BOJ.Silver;

import java.util.Scanner;

public class FindingPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] graph = new int[N][N];

        // 그래프 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        // 플로이드-워셜 알고리즘 적용
        for (int k = 0; k < N; k++) { // 거쳐가는 노드
            for (int i = 0; i < N; i++) { // 시작 노드
                for (int j = 0; j < N; j++) { // 도착 노드
                    if(graph[i][k] == 1 && graph[k][j] == 1){
                        graph[i][j] = 1;
                    }
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }
}
