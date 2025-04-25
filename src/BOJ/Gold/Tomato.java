package BOJ.Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Tomato {
    static int M, N;
    static int[][] box;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 가로
        N = sc.nextInt(); // 세로

        box = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j}); // 익은 토마토를 BFS 시작점으로
                }
            }
        }

        bfs();

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1); // 아직 안 익은 토마토가 있다면
                    return;
                }
                result = Math.max(result, box[i][j]);
            }
        }

        System.out.println(result - 1); // 처음 익은 토마토는 1이므로 1일 빼줌
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = box[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
