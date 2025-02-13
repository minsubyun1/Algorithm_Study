package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++){
            int order = Integer.parseInt(br.readLine());
            if (order == 0){
                if(queue.isEmpty()){
                    sb.append(0).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else {
                queue.add(order);
            }
        }

        System.out.println(sb);
    }
}
