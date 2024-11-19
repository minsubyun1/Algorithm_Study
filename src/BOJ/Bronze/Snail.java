package BOJ.Bronze;

import java.util.*;
public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int V = sc.nextInt();

        // (V - up + up - down - 1) / (up - down) + 1
        int days = (int) Math.ceil((double) (V - up) / (up - down)) + 1;

        System.out.println(days);
    }
}
