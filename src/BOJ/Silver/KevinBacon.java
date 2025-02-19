package BOJ.Silver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KevinBacon {
    static int N;

    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        graph = new ArrayList<>();

        // 그래프 초기화
        for (int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // 양방향 연결
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int minKevinBacon = Integer.MAX_VALUE;
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int kevinBacon = bfs(i);
            if (kevinBacon < minKevinBacon){
                minKevinBacon = kevinBacon;
                answer = i;
            }
        }

        System.out.println(answer);
    }

    static int bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        int[] dist = new int[N + 1]; // start부터 각 노드까지의 거리

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()){
            int cur = queue.poll();

            for (int next : graph.get(cur)) {
                if (!visited[next]){
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    queue.add(next);
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += dist[i]; // 모든 노드까지의 거리 합산
        }
        return sum;
    }
}
