package PROG.Lv0;
import java.util.*;
public class Rectangle {
    public int solution(int[][] dots) {
        int answer = 0;
        int minX = dots[0][0]; // x좌표의 최솟값
        int minY = dots[0][1]; // y좌표의 최솟값
        int maxX = dots[0][0]; // x좌표의 최댓값
        int maxY = dots[0][1]; // y좌표의 최댓값

        for(int i = 1; i < dots.length; i++){
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
        }

        // 직사각형의 넓이는 가로 x 세로
        answer = (maxX - minX) * (maxY - minY);

        return answer;
    }
}
