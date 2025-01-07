package PROG.Lv1;

import java.util.Stack;

public class HateSameNum {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            // Stack이 비어있거나, 스택의 마지막 값과 다른 경우에만 추가
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        // Stack을 배열로 변환
        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop(); // Stack에서 역순으로 꺼내 배열에 저장
        }

        return answer;
    }
}
