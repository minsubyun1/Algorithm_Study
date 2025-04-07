package BOJ.Silver;

import java.util.HashSet;
import java.util.Scanner;

public class KindBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            if(str.equals("ENTER")){
                count += set.size();
                set.clear();
            } else {
                set.add(str);
            }

        }

        count += set.size();

        System.out.println(count);

    }
}
