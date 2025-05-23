package PROG.Lv1;

import java.util.*;

public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];
        int index = 0;
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            ArrayList<Integer> result = new ArrayList<>();

            for (int j = start - 1; j < end; j++) {
                result.add(arr[j]);
            }

            Collections.sort(result);
            answer[index++] = result.get(k - 1);
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
