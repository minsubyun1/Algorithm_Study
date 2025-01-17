package BOJ.Silver;

import java.util.*;

public class BFSDFS {
    static boolean visited[];
    static ArrayList<Integer>A[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();
        A = new ArrayList[N+1];

        for (int i = 1; i <= N; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            // 양방향이니까 반대로도 해줌
            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 1; i < N; i++){
            // 각 에지들은 오름차순으로 정렬
            // 1부터 객체 생성 했으니까~
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(start);
        System.out.println();
        // visited 배열 초기화 해주기
        visited = new boolean[N + 1];
        BFS(start);
        System.out.println();
    }

    private static void BFS(int Node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node] = true;

        while(!queue.isEmpty()){
            int now_Node = queue.poll();
            System.out.print(now_Node + " ");
            for(int i : A[now_Node]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void DFS(int Node){
        System.out.print(Node + " ");
        visited[Node] = true;
        for(int i : A[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }


}
