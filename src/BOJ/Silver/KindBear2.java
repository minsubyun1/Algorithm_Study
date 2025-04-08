package BOJ.Silver;

import java.util.HashSet;
import java.util.Scanner;
public class KindBear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashSet<String> dancers = new HashSet<>();
        dancers.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String person1 = sc.next();
            String person2 = sc.next();
            if(dancers.contains(person1)){
                dancers.add(person2);
            } else if (dancers.contains(person2)){
                dancers.add(person1);
            }
        }

        System.out.println(dancers.size());
    }
}
