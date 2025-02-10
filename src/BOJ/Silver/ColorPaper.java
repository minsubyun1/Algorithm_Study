package BOJ.Silver;

import java.util.Scanner;
public class ColorPaper {
    static int[][] paper; // 종이 배열
    static int white = 0; // 하얀색 개수
    static int blue = 0; // 파란색 개수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 종이의 크기
        paper = new int[N][N];

        // 종이 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        // 분할 정복 실행
        divide(0, 0, N);

        // 결과 출력
        System.out.println(white);
        System.out.println(blue);


    }
    // (x, y)에서 시작하는 size 크기의 종이를 검사
    static void divide(int x, int y, int size){
        if (checkColor(x, y, size)) { // 같은 색인지 확인
            if (paper[x][y] == 0) white++;  // 하얀색 카운트 증가
            else blue++;  // 파란색 카운트 증가
            return;
        }
        // 4등분하여 재귀적으로 검사
        int newSize = size / 2;
        divide(x, y, newSize); // 1사분면
        divide(x, y + newSize, newSize); // 2사분면
        divide(x + newSize , y, newSize); // 3사분면
        divide(x + newSize, y + newSize, newSize); // 4사분면
    }

    // 해당 영역이 같은 색인지 확인하는 함수
    static boolean checkColor(int x, int y, int size){
        int color = paper[x][y]; // 첫 번째 색
        for (int i = x; i < x + size; i++){
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) return false; // 다른 색이면 false
            }
        }
        return true;
    }
}
