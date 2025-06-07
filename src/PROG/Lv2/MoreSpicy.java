package PROG.Lv2;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;

        // 모든 음식 우선순위 큐에 넣기
        for (int s : scoville) {
            pq.offer(s);
        }

        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            int mixed = first + (second + 2);
            pq.offer(mixed);
            count++;
        }

        System.out.println(count);

    }
}
