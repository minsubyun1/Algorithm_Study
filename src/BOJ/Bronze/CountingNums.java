package BOJ.Bronze;

import java.util.Scanner;
public class CountingNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++){
            if(arr[i] == num){
                count++;
            }
        }

        System.out.println(count);
    }
}
