package BOJ.Bronze;

import java.util.Arrays;
import java.util.Scanner;
public class ThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 배열 정렬

        System.out.println(arr[1]);

    }
}
