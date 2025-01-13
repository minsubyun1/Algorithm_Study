package BOJ.Silver;


import java.util.Scanner;
import java.util.Stack;

public class Zero_Improved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력 개수
        Stack<Integer> stack = new Stack<>();
        int sum = 0; // 누적 합

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                // 최근 수를 제거하고 합에서 뺌
                if (!stack.isEmpty()) {
                    sum -= stack.pop();
                }
            } else {
                // 스택에 추가하고 합에 더함
                stack.push(num);
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
