package BOJ.Silver;

import java.util.*;

public class PrinterQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while(testCases-- > 0){
            // 문서의 개수와 궁금한 문서의 위치
            int n = sc.nextInt();
            int m = sc.nextInt();

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++){
                int priority = sc.nextInt();
                queue.add(new int[] {i, priority}); //{문서위치, 중요도}
                priorityQueue.add(priority);
            }

            int printOrder = 0;

            while(!queue.isEmpty()){
                int[] current = queue.poll(); // 현재 문서
                if(current[1] == priorityQueue.peek()){ // 현재 문서 중요도가 가장 높다면
                    printOrder++;
                    priorityQueue.poll(); // 최고 중요도 제거

                    if(current[0] == m) { // 궁금한 문서라면
                        System.out.println(printOrder);
                        break;
                    }
                } else { // 중요도가 높지 않으면 뒤로 보냄
                    queue.add(current);
                }
            }
        }
        sc.close();
    }
}
