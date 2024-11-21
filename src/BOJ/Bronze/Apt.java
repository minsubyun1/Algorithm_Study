package BOJ.Bronze;

import java.util.Scanner;
public class Apt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 아파트 배열 초기화
        int[][] arr = new int[15][15];
        for(int i = 1; i < arr.length; i++){ //0층 초기화
            arr[0][i] = i;
        }


        for(int i = 1; i < arr.length; i++){ // 누적 합 계산
            for(int j = 1; j < arr.length; j++){
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        int N = sc.nextInt();
        int[] answer = new int[N];
        for(int i = 0; i < N; i++){
            int floor = sc.nextInt();
            int room = sc.nextInt();
            answer[i] = arr[floor][room];
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
