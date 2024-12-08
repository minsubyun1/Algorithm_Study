package BOJ.Silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SortInside {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        while(N != 0){
            arr.add(N % 10);
            N = N / 10;
        }

        Collections.sort(arr, Collections.reverseOrder());

        for(Integer i : arr){
            System.out.print(i);
        }
    }
}
