package PROG.Lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Truck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bridge_length = sc.nextInt();
        int weight = sc.nextInt();
        int[] truck_weights = new int[4];
        for (int i = 0; i < 4; i++) {
            truck_weights[i] = sc.nextInt();
        }

        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int totalWeight = 0;
        int idx = 0;

        // 다리 길이만큼 0으로 초기화
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (idx < truck_weights.length) {
            time++;

            totalWeight -= bridge.poll();

            if(totalWeight + truck_weights[idx] <= weight){
                bridge.add(truck_weights[idx]);
                totalWeight += truck_weights[idx];
                idx++;
            } else {
                bridge.add(0); // 지연되게 추가
            }
        }

        // 마지막 트럭 건너는 시간
        time += bridge_length;
        System.out.println(time);
    }
}
