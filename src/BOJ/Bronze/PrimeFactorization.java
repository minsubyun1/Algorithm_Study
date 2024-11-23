package BOJ.Bronze;

import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // 소인수는 2부터 시작, 루트까지 확인해서 범위 줄임
        for(int i = 2; i <= Math.sqrt(num); i++){
            while(num % i == 0){
                System.out.println(i);
                num /= i;
            }
        }

        // 루프를 빠져나왔을 때, 남은 숫자가 1보다 크면 그것도 소수
        if(num > 1){
            System.out.println(num);
        }

    }
}
