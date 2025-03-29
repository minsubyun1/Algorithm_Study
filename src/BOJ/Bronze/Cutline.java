package BOJ.Bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Cutline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr, Collections.reverseOrder());

        System.out.println(arr.get(K - 1));

    }
}
