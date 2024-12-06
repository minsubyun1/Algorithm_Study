package BOJ.Silver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Card2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }

        while(queue.size() > 1){
            queue.poll(); // 첫 번째 카드 버림
            queue.offer(queue.poll()); // 두 번째 카드 꺼내서 뒤로 추가
        }

        System.out.println(queue.poll()); // 마지막 카드 꺼내서 출력
    }
}
