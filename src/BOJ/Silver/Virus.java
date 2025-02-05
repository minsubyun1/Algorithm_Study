package BOJ.Silver;

import java.util.*;
public class Virus {
    static boolean visited[];
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        graph = new ArrayList<>();
        visited = new boolean[N + 1];


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

        int count = 0; // 연결된 개수

        dfs(1);

        for (int i = 1; i <= N; i++){
            if(visited[i]){
                count++;
            }
        }

        System.out.println(count - 1);
    }

    static void dfs(int node){
        visited[node] = true; // 현재 노드 방문 체크

        for (int next : graph.get(node)){
            if(!visited[next]){
                dfs(next); // 방문하지 않은 노드 계속 탐색
            }
        }
    }
}
