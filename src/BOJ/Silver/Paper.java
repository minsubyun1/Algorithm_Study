package BOJ.Silver;

import java.util.Scanner;
public class Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // (x, y)부터 10x10 영역을 true로 설정
            for (int dx = 0; dx < 10; dx++) {
                for (int dy = 0; dy < 10; dy++) {
                    paper[x + dx][y + dy] = true;
                }
            }
        }

        int count = 0;
        for (boolean[] booleans : paper) {
            for (boolean b : booleans) {
                if(b){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
