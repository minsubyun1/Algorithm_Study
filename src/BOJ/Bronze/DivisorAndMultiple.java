package BOJ.Bronze;

import java.util.Scanner;
public class DivisorAndMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // GCD 계산 (유클리드 알고리즘)
        int num1 = a, num2 = b;
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int maxDiv = num1; // 최대 공약수

        // LCM 계산
        int minMul = (a * b) / maxDiv;

        // 결과 출력
        System.out.println(maxDiv);
        System.out.println(minMul);
    }
}
