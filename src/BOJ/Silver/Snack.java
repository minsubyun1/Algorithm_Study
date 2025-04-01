package BOJ.Silver;

import java.util.Scanner;
import java.util.Stack;

public class Snack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int sequence = 1;  // 순서대로 나와야 할 번호

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            // 현재 번호가 받아야 할 번호면 바로 받기
            if (num == sequence) {
                sequence++;

                // 보조 스택에 저장된 값도 순서대로 나오면 꺼내기
                while (!stack.isEmpty() && stack.peek() == sequence) {
                    stack.pop();
                    sequence++;
                }
            } else {
                // 순서가 아니면 보조 스택에 저장
                stack.push(num);
            }
        }

        // 보조 스택을 다 확인해서 순서대로 나오면 NICE
        while (!stack.isEmpty()) {
            if (stack.pop() != sequence) {
                System.out.println("Sad");
                return;
            }
            sequence++;
        }

        System.out.println("Nice");
    }
}
