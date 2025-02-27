package BOJ.Silver;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Deque0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String order = sc.next();

            if(order.equals("push_front")){
                int num = sc.nextInt();
                deque.addFirst(num);
            } else if(order.equals("push_back")){
                int num = sc.nextInt();
                deque.addLast(num);
            } else if(order.equals("pop_front")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollFirst());
                }
            } else if(order.equals("pop_back")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
            } else if(order.equals("size")){
                System.out.println(deque.size());
            } else if(order.equals("empty")){
                if(deque.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(order.equals("front")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }
            } else if(order.equals("back")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}
