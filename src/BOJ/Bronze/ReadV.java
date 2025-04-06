package BOJ.Bronze;

import java.util.*;
public class ReadV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = Character.toString(str.charAt(j));
            }
        }

        String result = "";

        for (int i = 0; i < 15; i++) {
            for (int j = 0;j < 5; j++) {
                if(arr[j][i] == null){
                    continue;
                } else {
                    result += arr[j][i];
                }
            }
        }

        System.out.println(result);
    }
}
