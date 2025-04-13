package BOJ.Silver;

import java.util.*;

public class BFS {
    static boolean[] visited;
    static ArrayList<Integer> A[];
    static int[] sequence;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        A = new ArrayList[N + 1];
        sequence = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            A[u].add(v);
            A[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];

        BFS(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(sequence[i]);
        }



    }

    private static void BFS(int node){

        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        queue.add(node);
        visited[node] = true;
        sequence[node] = count;

        while(!queue.isEmpty()){
            int now_node = queue.poll();
            for (int i : A[now_node]) {
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    sequence[i] = ++count;
                }
            }
        }
    }
}
