package BOJ.Silver;

import java.util.Scanner;
import java.util.Stack;
public class VPS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < T; i++){
            String input = sc.nextLine();
            System.out.println(isVPS(input) ? "YES" : "NO");
        }
    }

    // 올바른 괄호 문자열인지 확인하는 메서드
    public static boolean isVPS(String str){
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()){
            if(ch == '('){
                stack.push(ch); // 여는 괄호는 스택에 추가
            } else if(ch == ')'){
                if(stack.isEmpty()){
                    return false; // 스택이 비어있는데 닫는 괄호가 나오면 No
                }
                stack.pop(); // 여는 괄호와 매칭
            }
        }
        return stack.isEmpty(); // 스택이 비어있어야 올바른 VPS
    }
}
