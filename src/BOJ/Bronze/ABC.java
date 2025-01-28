package BOJ.Bronze;

import java.util.Scanner;
public class ABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int c = sc.nextInt();

        String ab = a + b;
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int AB = Integer.parseInt(ab);

        System.out.println(A + B - c);
        System.out.println(AB - c);
    }
}
