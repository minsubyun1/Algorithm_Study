package BOJ.Gold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ChickenDelivery {
    static class Point {
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int N, M;
    static List<Point> houses = new ArrayList<>();
    static List<Point> chickens = new ArrayList<>();
    static int minDistance = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        // 도시 정보 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    houses.add(new Point(i, j));
                } else if(val == 2){
                    chickens.add(new Point(i, j));
                }
            }
        }

        // 치킨집 조합 구하기
        combine(0, new ArrayList<>());

        System.out.println(minDistance);




    }

    //조합 생성
    static void combine(int start, List<Point> selected) {
        if(selected.size() == M){
            // 선택된 M개의 치킨집으로 도시 치킨 거리 계산
            int dist = getCityChickenDistance(selected);
            minDistance = Math.min(minDistance, dist);
            return;
        }
        for (int i = start; i < chickens.size(); i++) {
            selected.add(chickens.get(i));
            combine(i + 1, selected);
            selected.remove(selected.size() - 1); // 백트래킹
        }
    }

    // 도시 치킨 거리 계산
    static int getCityChickenDistance(List<Point> selectedChickens){
        int total = 0;

        for (Point house : houses) {
            int min = Integer.MAX_VALUE;
            for (Point chicken : selectedChickens) {
                int dist = Math.abs(house.x - chicken.x) + Math.abs(house.y - chicken.y);
                min = Math.min(min, dist);
            }
            total += min;
        }
        return total;
    }
}
