package PROG.Lv0;

public class SafeZone {

    public int solution(int[][] board) {
        int[][] danger = new int[board.length][board.length];

        // 위험지역 표시하기
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    // 1이 위치한 곳이 (0,0), (0, board.length-1), (board.length-1, 0), (board.length-1, board.length-1)일 수도 있음을 유의하기 위해 변수 설정
                    int iminus = Math.max(i-1, 0);
                    int iplus = Math.min(i+1, board.length-1);
                    int jminus = Math.max(j-1, 0);
                    int jplus = Math.min(j+1, board.length-1);

                    danger[i][j] = 1;
                    danger[i][jminus] = 1;
                    danger[i][jplus] = 1;
                    danger[iminus][j] = 1;
                    danger[iminus][jminus] = 1;
                    danger[iminus][jplus] = 1;
                    danger[iplus][j] = 1;
                    danger[iplus][jminus] = 1;
                    danger[iplus][jplus] = 1;
                }
            }
        }

        // 위험지역 세기

        int answer = 0;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(danger[i][j] == 0){
                    answer++;
                }
            }
        }


        return answer;
    }
}
