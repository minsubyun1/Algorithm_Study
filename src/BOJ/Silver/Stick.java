package BOJ.Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        int stick = 64;

        arr.add(stick);

        while(true){
            int sum = 0;

            for (Integer i : arr){
                sum += i;
            }

            if (sum == X){
                System.out.println(arr.size());
                break;
            }

            int num = arr.get(0) / 2;
            arr.remove(0);
            arr.add(num);
            arr.add(num);
            Collections.sort(arr);

            if (sum - num >= X){
                arr.remove(0);
            }
        }
    }
}
