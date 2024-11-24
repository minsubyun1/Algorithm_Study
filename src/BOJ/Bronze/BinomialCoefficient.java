package BOJ.Bronze;

import java.util.Scanner;
public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k == 0 || n == k){
            System.out.println(1);
            return;
        }

        // 이항 계수 계산
        int result = 1;
        for(int i = 1; i <= k; i++){
            result = result * (n - i + 1) / i;
        }

        System.out.println(result);

    }
}
