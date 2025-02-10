package BOJ.Silver;

import java.util.Scanner;
public class ColorPaper {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        paper = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                paper[i][j] = sc.nextInt();
            }
        }

        // 분할 정복 실행
        divide(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    static void divide(int x, int y, int size){
        if(checkColor(x, y, size)){ // 같은 색인지
            if (paper[x][y] == 0) white++; // 하얀색이면
            else blue++; // 파란색이면
            return;
        }

        // 아닌 경우 4등분하여 재귀적 검사
        int newSize = size / 2;
        divide(x, y, newSize); // 1사분면
        divide(x, y + newSize, newSize); // 2사분면
        divide(x + newSize, y, newSize); // 3사분면
        divide(x + newSize, y + newSize, newSize); // 4사분면
    }

    static boolean checkColor(int x, int y, int size){
        int color = paper[x][y]; // 첫 번째 색
        for (int i = x; i < x + size; i++){
            for (int j = y; j < y + size; j++){
                if(paper[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}
