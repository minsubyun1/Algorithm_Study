package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String a_line = br.readLine();
        String b_line = br.readLine();

        int[] a = new int[N];
        Integer[] b = new Integer[N];

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(a_line.split(" ")[i]);
            b[i] = Integer.parseInt(b_line.split(" ")[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int min = 0;
        for (int i = 0; i < N; i++) {
            min += a[i] * b[i];
        }

        System.out.println(min);



    }
}
