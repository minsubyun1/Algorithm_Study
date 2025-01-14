package BOJ.Silver;

import java.util.Scanner;
public class FactorialZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        // 5의 배수의 개수를 세기
        // 팩토리얼 직접 계산하지 않고, 5의 배수로 0의 개수를 셈.
        // 직접 계산시 값이 너무 커 오버플로우가 발생하거나, 런타임 에러
        for (int i = 5; i <= N; i *= 5) {
            count += N / i;
        }

        System.out.println(count);
    }
}
