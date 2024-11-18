package BOJ.Bronze;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N+1];
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[N]);
    }
}
