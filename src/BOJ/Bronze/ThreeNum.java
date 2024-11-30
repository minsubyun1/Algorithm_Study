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
        Arrays.sort(arr);

        int fir = arr[0];
        int sec = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(fir <= arr[i]){
                fir = arr[i];
                index = i;
            }
        }

        sec = arr[index-1];

        System.out.println(sec);

    }
}
