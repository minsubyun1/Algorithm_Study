package BOJ.Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato2 {
    static int M, N, H;
    static int[][][] box;
    static int[] dz = {-1, 1, 0, 0, 0, 0}; // 위 아래
    static int[] dx = {0, 0, -1, 1, 0, 0}; // 상 하
    static int[] dy = {0, 0, 0, 0, -1, 1}; // 좌 우
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 가로
        N = sc.nextInt(); // 세로
        H = sc.nextInt(); // 상자의 수

        box = new int[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    box[h][i][j] = sc.nextInt();
                    if(box[h][i][j] == 1){
                        queue.add(new int[]{h, i, j});
                    }
                }
            }
        }



        bfs();

        int result = 0;
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(box[h][i][j] == 0){
                        System.out.println(-1);
                        return;
                    }
                    result = Math.max(result, box[h][i][j]);
                }
            }
        }

        System.out.println(result - 1); // 처음 익은 토마토는 1이므로 1일 빼줌
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int z = now[0];
            int x = now[1];
            int y = now[2];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nz >= 0 && nz < H && nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (box[nz][nx][ny] == 0) {
                        box[nz][nx][ny] = box[z][x][y] + 1;
                        queue.add(new int[]{nz, nx, ny});
                    }
                }
            }
        }
    }
}
