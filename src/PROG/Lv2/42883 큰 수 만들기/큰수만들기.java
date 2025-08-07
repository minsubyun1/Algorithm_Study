import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 큰수만들기 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String number = "1924";
        int k = 2;
        for (char digit : number.toCharArray()) {
            while(!stack.isEmpty() && k >0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }


}