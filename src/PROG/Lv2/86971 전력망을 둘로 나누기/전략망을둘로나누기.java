import java.util.*;
public class 전략망을둘로나누기 {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {
            List<List<Integer>> graph = new ArrayList<>();

            for (int j = 0; j <= n; j++) {
                graph.add(new ArrayList<>());
            }

            // i를 제외하고 연결
            for (int j = 0; j < wires.length; j++) {
                if(j == i) {
                    continue;
                }
                int v1 = wires[j][0];
                int v2 = wires[j][1];
                graph.get(v1).add(v2);
                graph.get(v2).add(v1);
            }

            boolean[] visited = new boolean[n + 1];
            int count = BFS(1, graph, visited);

            int diff = Math.abs(n - 2 * count);

            answer = Math.min(diff, answer);
        }

        return answer;

    }

    private int BFS (int start, List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        int count = 1;

        while(!queue.isEmpty()){
            int node = queue.poll();

            for (int neighbor : graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                    count++;
                }
            }
        }
        return count;
    }
}