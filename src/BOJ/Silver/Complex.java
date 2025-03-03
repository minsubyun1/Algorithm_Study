package BOJ.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Complex {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동
    static int[] dy = {0, 0, -1, 1};
    static List<Integer> complexSizes = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++){
            String line = sc.next();
            for (int j = 0; j < N; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // 단지 찾기
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (map[i][j] == 1 && !visited[i][j]){
                    complexSizes.add(dfs(i,j));
                }
            }
        }

        // 결과 출력
        Collections.sort(complexSizes); // 오름차순 정렬
        System.out.println(complexSizes.size());
        for (Integer size : complexSizes){
            System.out.println(size);
        }
    }

    // DFS로 단지 출력
    private static int dfs(int x, int y){
        visited[x][y] = true;
        int count = 1; // 현재 집 개수 (자기 자신 포함)

        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    count += dfs(nx, ny);
                }
            }
        }

        return count;
    }

}
