package BOJ.Silver;

import java.util.Scanner;
import java.util.Stack;

public class BalanceWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();
            if(input.equals(".")){
                break; // 종료 조건
            }
            System.out.println(isBalanced(input) ? "yes" : "no");
        }
    }

    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();


        for (char ch : str.toCharArray()){
            if (ch == '(' || ch == '['){
                stack.push(ch); // 여는 괄호는 스택에 추가
            } else if(ch == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return false; // 스택이 비어있거나 짝이 맞지 않을 때
                }
                stack.pop(); // 여는 괄호와 매칭
            } else if(ch == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false; // 스택이 비어있거나 짝이 맞지 않을 때
                }
                stack.pop(); // 여는 괄호와 매칭
            }

        }
        return stack.isEmpty();
    }
}
