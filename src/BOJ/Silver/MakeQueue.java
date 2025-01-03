package BOJ.Silver;

import java.util.*;
public class MakeQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            String order = sc.next();
            if(order.equals("push")){
                int num = sc.nextInt();
                dq.offer(num);
            } else if(order.equals("pop")){
                if(dq.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(dq.poll());
                }
            } else if(order.equals("front")){
                if(dq.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(dq.peekFirst());
                }
            } else if(order.equals("size")){
                System.out.println(dq.size());
            } else if(order.equals("empty")){
                if(dq.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(order.equals("back")){
                if(dq.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(dq.peekLast());
                }
            }
        }
    }
}
