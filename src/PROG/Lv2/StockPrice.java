package PROG.Lv2;

import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices){
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            // 현재 가격이 이전 가격보다 낮아졌다면
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);


        }

        // 아직 떨어지지 않은 가격 처리
        while (!stack.isEmpty()){
            int top = stack.pop();
            answer[top] = prices.length - 1 - top;
        }

        return answer;
    }
}
