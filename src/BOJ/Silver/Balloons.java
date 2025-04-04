package BOJ.Silver;

import java.util.*;
public class Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Deque<int[]> deque = new ArrayDeque<>();

        // 풍선 번호와 숫자를 함께 저장
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            deque.addLast(new int[]{i + 1, num}); // 1 - based index
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()){
            int[] current = deque.pollFirst(); // 현재 풍선 터뜨리기
            sb.append(current[0]).append(" "); // 풍선 번호 기록
            int move = current[1]; // 이동 값

            if (deque.isEmpty()){
                break; // 마지막 풍선 처리했으면 종료
            }

            // 이동 처리
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) { // 시계 방향(양수)에서는 앞에서 하나 터트린 거 빼주기
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString());
    }
}
