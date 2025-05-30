package PROG.Lv2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Process {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int []> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++){
            queue.add(new int[]{i, priorities[i]});
            priorityQueue.add(priorities[i]);
        }

        int printOrder = 0;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            if (current[1] == priorityQueue.peek()){
                printOrder++;
                priorityQueue.poll();
                if(current[0] == location){
                    answer = printOrder;
                }
            } else {
                queue.add(current);
            }
        }


        return answer;
    }
}
