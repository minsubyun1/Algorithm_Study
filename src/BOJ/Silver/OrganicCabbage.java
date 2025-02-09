package BOJ.Silver;

import java.util.Scanner;
public class OrganicCabbage {

    static int[][] farm;
    static boolean[][] visited;
    static int M, N, K;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0){
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();

            farm = new int[N][M]; // 세로가 먼저
            visited = new boolean[N][M];

            // 배추 위치 입력
            for (int i = 0; i < K; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                farm[y][x] = 1; // x, y 입력 시 y가 세로, x가 가로
            }

            int count = 0;

            for (int i = 0; i < N; i++){
                for (int j = 0; j< M; j++){
                    if(farm[i][j] == 1 && !visited[i][j]){
                        dfs(i , j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;

        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M){ // 배열 범위 체크
                if (farm[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx, ny);
                }
            }
        }
    }
}
