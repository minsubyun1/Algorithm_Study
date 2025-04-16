package BOJ.Gold;

import java.util.Arrays;
import java.util.Scanner;

public class Star10 {
    static char[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(map[i], ' ');
        }

        // 2. 별 그리기 시작
        drawStar(0, 0, N);

        // 3. 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map[i]).append('\n');
        }
        System.out.print(sb);



    }

    private static void drawStar(int x, int y, int size){
        if (size == 1){
            map[x][y] = '*'; // 가장 작은 단위
            return;
        }

        int newSize = size / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 가운데 비우기
                if (i == 1 && j == 1){
                    continue;
                }
                drawStar(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }
}
