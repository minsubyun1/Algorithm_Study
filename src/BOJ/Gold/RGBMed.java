package BOJ.Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class RGBMed {
    static int N;
    static String[][] box;
    static boolean[][] visited;
    static boolean[][] visitedMed;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};


    static int count;
    static int medCount;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        box = new String[N][N];
        visited = new boolean[N][N];
        visitedMed = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String alpha = sc.next();
            for (int j = 0; j < N; j++) {
                box[i][j] = String.valueOf(alpha.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    bfs(i, j);
                    count++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visitedMed[i][j]){
                    bfsMed(i, j);
                    medCount++;
                }
            }
        }


        System.out.println(count + " " + medCount);

    }


    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        String color = box[x][y];

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (!visited[nx][ny] && box[nx][ny].equals(color)) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }


        }
    }

    public static void bfsMed(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visitedMed[x][y] = true;
        String color = box[x][y];

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if(!visitedMed[nx][ny]){
                        if((box[nx][ny].equals("R") && color.equals("G")) || (box[nx][ny].equals("G") && color.equals("R")) || (box[nx][ny].equals(color))){
                            visitedMed[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        }
                    }

                }
            }



        }
    }
}
