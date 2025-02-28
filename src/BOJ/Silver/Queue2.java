package BOJ.Silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Queue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine()); // 명령 개수 입력

        for (int i = 0; i < N; i++) {
            String command = br.readLine(); // 명령 입력

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                queue.offer(value);
            } else if (command.equals("pop")) {
                sb.append(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
            } else if (command.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
            } else if (command.equals("back")) {
                sb.append(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
            }
        }

        System.out.print(sb); // 최종 결과 한 번에 출력
    }
}
