package BOJ.Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideAndSeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수빈이 위치

        int K = sc.nextInt(); // 동생 위치

        System.out.println(bfs(N, K));
    }

    public static int bfs(int start, int target){
        if (start == target) return 0; // 시작과 목표가 같다면 0초

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001]; // 방문 여부 체크 배열

        queue.add(new int[]{start, 0});  // {현재 위치, 시간}
        visited[start] = true;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int position = current[0];
            int time = current[1];

            // 이동 가능한 경우 탐색
            int[] nextPositions = {position -1, position + 1, position * 2};

            for (int next : nextPositions) {
                if(next == target) {
                    return time + 1; // 목표 도달 시 즉시 종료
                }

                if(next >= 0 && next <= 100000 && !visited[next]){
                    queue.add(new int[]{next, time + 1});
                    visited[next] = true; // 방문 표시
                }
            }
        }
        return - 1;
    }
}
