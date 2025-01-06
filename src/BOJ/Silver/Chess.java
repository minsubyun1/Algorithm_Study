package BOJ.Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Chess {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력: N과 M
        String[] dimensions = br.readLine().split(" ");
        int N = Integer.parseInt(dimensions[0]);
        int M = Integer.parseInt(dimensions[1]);

        // 체스판 보드 입력
        char[][] board = new char[N][M];
        for(int i = 0; i < N; i++){
            board[i] = br.readLine().toCharArray();
        }

        // 최소 다시 칠하기 개수를 저장할 변수
        int minRepaint = Integer.MAX_VALUE;

        // 8x8 체스판을 자르며 탐색
        for (int i = 0; i <= N - 8; i++){
            for (int j = 0; j <= M - 8; j++){
                // 두 가지 패턴에 대해 다시 칠해야 하는 칸 계산
                int repaintCount1 = 0;
                int repaintCount2 = 0;

                for (int x = 0; x < 8; x++){
                    for (int y = 0; y < 8; y++){
                        char current = board[i + x][j + y];

                        // 첫 칸이 W인 체스판과 비교
                        if((x + y) % 2 == 0){ // 짝수 칸
                            if(current != 'W'){
                                repaintCount1++;
                            }
                        } else {
                            if(current != 'B'){
                                repaintCount1++;
                            }
                        }

                        // 첫 칸이 B인 체스판과 비교
                        if((x + y) % 2 == 0){ // 짝수 칸
                            if(current != 'B'){
                                repaintCount2++;
                            }
                        } else {
                            if(current != 'W'){
                                repaintCount2++;
                            }
                        }
                    }
                }
                // 최소값 갱신
                minRepaint = Math.min(minRepaint, Math.min(repaintCount1, repaintCount2));
            }
        }

        System.out.println(minRepaint);
    }
}
