package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            int order = Integer.parseInt(command.split(" ")[0]);
            if(order == 1){
                int x = Integer.parseInt(command.split(" ")[1]);
                stack.push(x);
            } else if (order == 2){
                sb.append(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
            } else if (order == 3){
                sb.append(stack.size() + "\n");
            } else if (order == 4){
               sb.append(stack.isEmpty() ? "1\n" : "0\n");
            } else if(order == 5){
                sb.append(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
            }
        }

        System.out.println(sb);
    }
}
