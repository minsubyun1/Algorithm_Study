package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class VirusImproved {
    static boolean visited[];
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        visited = new boolean[N + 1];


        // 그래프 초기화
        for (int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        // 간선 입력 (양방향)
        for (int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int count = dfs(1);

        System.out.println(count);
    }

    static int dfs(int node){
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true; // 현재 노드 방문 체크

        int infectedCount = 0;

        while(!stack.isEmpty()){
            int current = stack.pop();

            for (int next : graph.get(current)){
                if(!visited[next]){
                    visited[next] = true;
                    stack.push(next);
                    infectedCount++;
                }
            }
        }

        return infectedCount;
    }
}
