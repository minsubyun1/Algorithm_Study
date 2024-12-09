package BOJ.Silver;

import java.util.ArrayList;
import java.util.Scanner;
public class ConnectedComponents {
    static ArrayList<ArrayList<Integer>> graph; // 인접 리스트
    static boolean[] visited; // 방문 여부 체크 배열
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        graph = new ArrayList<>();
        visited = new boolean[N + 1]; // 정점이 1부터 시작하므로 N + 1 크기로 초기화

        // 그래프 초기화
        for (int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v); // 양방향 연결
            graph.get(v).add(u);
        }

        int componentCount = 0; // 연결 요소의 개수

        // 모든 정점에 대해 방문 여부 확인
        for(int i = 1; i <= N; i++){
            if(!visited[i]){ // 방문하지 않은 정점에서 탐색 시작
                dfs(i); // 연결된 모든 정점을 탐색
                componentCount++; // 탐색을 시작했으므로 연결 요소 개수 증가
            }
        }
        System.out.println(componentCount);
    }

    static void dfs(int node){
        visited[node] = true; // 현재 노드 방문 체크

        for(int next : graph.get(node)){ // 현재 노드에 연결된 노드를 탐색
            if(!visited[next]){
                dfs(next); // 방문하지 않은 노드를 계속 탐색
            }
        }
    }
}
