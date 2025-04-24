package BOJ.Silver;

import java.util.ArrayList;
import java.util.Scanner;
public class ParentNode {
    static boolean visited[];
    static ArrayList<Integer> A[];

    static int[] parent;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i <= N; i++){
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            A[u].add(v);
            A[v].add(u);
        }


        DFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }

    }

    private static void DFS(int Node){
        visited[Node] = true;

        for(int neighbor : A[Node]){
            if(!visited[neighbor]){
                parent[neighbor] = Node; // 현재 노드 부모로 등록
                DFS(neighbor);
            }
        }
    }
}
