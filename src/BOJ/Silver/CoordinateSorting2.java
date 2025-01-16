package BOJ.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CoordinateSorting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Point> points = new ArrayList<>();

        // 좌표 입력 받기
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }

        // 정렬
        Collections.sort(points);

        // 결과 출력
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
}

class Point implements Comparable<Point>{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        // y좌표 기준으로 정렬
        if(this.y != other.y){
            return this.y - other.y;
        }

        return this.x - other.x;
    }
}