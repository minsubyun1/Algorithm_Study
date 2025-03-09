package BOJ.Silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SequenceOfSuffixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.substring(i);
        }

        // 사전순 정렬
        Arrays.sort(arr);

        for (String suffix : arr) {
            System.out.println(suffix);
        }
    }
}
