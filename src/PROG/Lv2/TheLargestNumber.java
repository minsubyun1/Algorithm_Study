package PROG.Lv2;

import java.util.Arrays;
import java.util.Scanner;

public class TheLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        String[] strNums = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
         }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) {
            System.out.println("0");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String num : strNums) {
            sb.append(num);
        }

        System.out.println(sb.toString());
    }
}
