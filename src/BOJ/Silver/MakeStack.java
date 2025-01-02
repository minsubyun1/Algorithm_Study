package BOJ.Silver;

import java.util.*;
public class MakeStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < N; i++){
            String order = sc.next();
            if(order.equals("push")){
                int pus_num = sc.nextInt();
                st.push(pus_num);
            } else if(order.equals("pop")){
                if(st.empty()){
                    System.out.println(-1);
                } else {
                    System.out.println(st.pop());
                }
            } else if(order.equals("top")){
                if(st.empty()){
                    System.out.println(-1);
                } else {
                    System.out.println(st.peek());
                }
            } else if(order.equals("size")){
                System.out.println(st.size());
            } else if(order.equals("empty")){
                if(st.empty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
