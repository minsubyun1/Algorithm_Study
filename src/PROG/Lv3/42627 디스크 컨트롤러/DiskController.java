package PROG.Lv3;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DiskController {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][]jobs = new int[3][2];

        for (int i = 0; i < jobs.length; i++) {
            for (int j = 0; j < jobs[i].length; j++) {
                jobs[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]); // 요청 시각 기준 정렬

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1]; // 소요시간 짧은 것 우선
            return a[0] - b[0]; // 요청 시각 빠른 것 우선
        });

        int time = 0; // 현재 시간
        int idx = 0;  // jobs 배열 순회 인덱스
        int totalTime = 0;
        int count = 0;

        while (count < jobs.length) {
            // 현재 시간 이전에 요청된 작업들을 대기 큐에 넣음
            while (idx < jobs.length && jobs[idx][0] <= time) {
                pq.offer(jobs[idx]);
                idx++;
            }

            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                time += job[1]; // 작업 수행 시간만큼 증가
                totalTime += (time - job[0]); // 작업 종료 시각 - 요청 시각
                count++;
            } else {
                // 대기 큐가 비었으면 다음 작업의 요청 시각으로 jump
                time = jobs[idx][0];
            }
        }

        System.out.println(totalTime / jobs.length);
    }
}


