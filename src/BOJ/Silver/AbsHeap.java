package BOJ.Silver;

import java.util.PriorityQueue;
import java.util.Scanner;
public class AbsHeap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 우선순위 큐: 절댓값이 작은 순서, 같다면 원래 값이 작은 순서
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if(absA == absB) return a - b; // 절댓값이 같으면 원래 값 기준 오름차순
            return absA - absB; // 절댓값 기준 오름차순
        });

        for(int i = 0; i < N; i++){
            int num = sc.nextInt();

            if(num == 0){
                if(pq.isEmpty()){
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll()); // 절댓값이 가장 작은 수 출력 및 제거
                }
            } else {
                pq.offer(num); // 우선순위 큐에 추가
            }
        }
    }
}
