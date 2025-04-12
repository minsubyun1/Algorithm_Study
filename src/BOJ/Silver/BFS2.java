package BOJ.Silver;

import java.util.*;

public class BFS2 {
    static boolean[] visited;
    static ArrayList<Integer>A[];
    static int[] sequence;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정점의 수
        int M = sc.nextInt(); // 간선의 수
        int R = sc.nextInt(); // 시작 정점

        A = new ArrayList[N + 1];
        sequence = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            A[u].add(v);
            A[v].add(u); // 양방향
        }
        // 내림차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i], Collections.reverseOrder());
        }

        visited = new boolean[N + 1];
        BFS(R);
        for (int i = 1; i <= N; i++) {
            System.out.println(sequence[i]);
        }
    }

    private static void BFS(int Node){

        Queue<Integer> queue = new LinkedList<Integer>();
        int count = 1;
        queue.add(Node);
        visited[Node] = true;
        sequence[Node] = count;


        while(!queue.isEmpty()){
            int now_Node = queue.poll();
            for(int i : A[now_Node]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    sequence[i] = ++count;
                }
            }
        }
    }
}
