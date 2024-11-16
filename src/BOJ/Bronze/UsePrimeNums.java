package BOJ.Bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class UsePrimeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = M; i <= N; i++){
            if(i == 1){
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    // 소수 배열에 추가
                    isPrime = false;
                }
            }
            if(isPrime){
                arr.add(i);
            }
        }
        if(arr.isEmpty()){
            System.out.println(-1);
        } else {
            int sum = 0;
            for (Integer i : arr) {
                sum += i;
            }

            int min = Collections.min(arr);
            System.out.println(sum);
            System.out.println(min);
        }


    }
}
