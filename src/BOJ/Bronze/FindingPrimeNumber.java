package BOJ.Bronze;

import java.util.Scanner;
public class FindingPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            boolean isPrime = true;
            if(num == 1){
                continue;
            }
            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}
