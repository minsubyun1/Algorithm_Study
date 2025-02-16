package BOJ.Silver;

import java.util.*;
public class NeedFriend {
    static int N, M;
    static char[][] campus;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        campus = new char[N][M];
        visited = new boolean[N][M];

        int startX = 0, startY = 0;

        for (int i = 0; i < N; i++){
            String line = sc.nextLine();
            for (int j = 0; j < M; j++){
                campus[i][j] = line.charAt(j);
                if(campus[i][j] == 'I'){
                    startX = i;
                    startY = j;
                }
            }
        }

        // BFS 실행
        int result = bfs(startX, startY);

        System.out.println(result > 0 ? result : "TT");
    }

    static int bfs(int startX, int startY){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        int count = 0; // 만난 사람 수

        while (!queue.isEmpty()){
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 체크 & 방문 여부 체크
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]){
                    if(campus[nx][ny] != 'X'){ // 벽이 아닐 때만 이동 가능
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        if(campus[nx][ny] == 'P'){
                            count++; // 사람을 만나면 카운트 증가
                        }
                    }
                }

            }
        }
        return count;
    }
}
