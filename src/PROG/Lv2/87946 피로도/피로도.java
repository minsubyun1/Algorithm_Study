public class 피로도 {
    static int answer = 0;

    public int solution (int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(0, k, dungeons, visited);
        return answer;
    }

    public void dfs(int count, int k, int[][] dungeons, boolean[] visited) {
        answer = Math.max(answer, count); // 던전 개수 갱신

        for (int i = 0; i < dungeons.length; i++) {
            int minFatigue = dungeons[i][0];
            int useFatigue = dungeons[i][1];

            // 아직 방문하지 않았고, 현재 피로도가 최소 필요 피로도 이상이면
            if (!visited[i] && k >= minFatigue) {
                visited[i] = true;
                dfs(count + 1, k - useFatigue, dungeons, visited);
                visited[i] = false;
            }
        }
    }
}