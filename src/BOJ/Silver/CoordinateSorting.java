package BOJ.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class CoordinateSorting {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 점의 개수
        List<Point> points = new ArrayList<>();

        // 좌표 입력 받기
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x,y));
        }

        // 정렬
        Collections.sort(points);

        // 결과 출력
        for (Point point: points){
            System.out.println(point.x + " " + point.y);
        }
    }
}

class Pointi implements Comparable<Point>{
    int x, y;
    public Pointi(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other){
        // x좌표 기준으로 정렬
        if(this.x != other.x){
            return this.x - other.x;
        }

        // x 좌표가 같다면 y 좌표 기준으로 정렬
        return this.y - other.y;
    }
}