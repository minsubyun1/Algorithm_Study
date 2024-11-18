package BOJ.Bronze;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 비교를 위한 기준 배열
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] des = {8, 7, 6, 5, 4, 3, 2, 1};

        // 결과 출력
        if(Arrays.equals(arr, asc)){
            System.out.println("ascending");
        } else if(Arrays.equals(arr, des)){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
