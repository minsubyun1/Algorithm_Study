package BOJ.Silver;

import java.util.*;
public class Maze {
    static int N, M;
    static int[][] maze; // 미로 배열
    static boolean[][] visited; // 방문 여부 체크 배열
    static int[] dx = {0, 0, -1, 1}; // 상, 하, 좌, 우
    static int[] dy = {-1, 1, 0, 0};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        maze = new int[N][M];
        visited = new boolean[N][M];

        // 미로 입력 받기
        for(int i = 0; i < N; i++){
            String line = sc.next();
            for(int j = 0; j < M; j++){
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    static int bfs(int startX, int startY){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 목적지 도달 시 결과 반환
            if (x == N -1 && y == M -1){
                return maze[x][y];
            }

            // 네 방향으로 탐색
            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위를 벗어나지 않고 방문하지 않은 칸만 탐색
                if(nx >= 0 && ny >= 0 && nx < N && ny < M){
                    if(!visited[nx][ny] && maze[nx][ny] == 1){
                        visited[nx][ny] = true; // 방문 처리
                        maze[nx][ny] = maze[x][y] + 1; // 거리 누적
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1; // 도달 불가능한 경우 (문제 조건상 항상 가능)
    }
}
