package BOJ.Silver;

import java.util.Scanner;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 총 숫자의 개수
        int[] sequence = new int[N]; // 목표 수열을 저장할 배열

        for(int i = 0; i < N; i++){
            sequence[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder(); // 연산 결과 저장
        int currentNumber = 1; // 스택에 넣을 숫자
        boolean isPossible = true;

        for (int target : sequence){ // 목표 수열의 각 숫자에 대해 처리
            // 스택에 목표 숫자가 들어갈 때까지 push
            while(currentNumber <= target){
                stack.push(currentNumber++);
                result.append("+\n");
            }

            // 스택의 맨 위 숫자가 목표 숫자와 같다면 pop
            if(stack.peek() == target){
                stack.pop();
                result.append("-\n");
            } else {
                // 스택의 맨 위 숫자가 목표 숫자보다 크면 불가능
                isPossible = false;
                break;
            }
        }

        if(isPossible){
            System.out.println(result.toString());
        } else {
            System.out.println("NO");
        }
    }

}
