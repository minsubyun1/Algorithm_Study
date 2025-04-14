package BOJ.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DFS {
    static boolean[] visited;
    static ArrayList<Integer> A[];
    static int[] sequence;
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        A = new ArrayList[N + 1];
        sequence = new int[N  + 1];
        visited = new boolean[N + 1];

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

        DFS(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(sequence[i]);
        }

    }

    private static void DFS(int Node){
        sequence[Node] = ++count;
        visited[Node] = true;
        for (int i : A[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
