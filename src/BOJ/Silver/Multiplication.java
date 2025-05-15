package BOJ.Silver;


import java.math.BigInteger;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        // a ^ b % c
        BigInteger result = a.modPow(b, c);
        System.out.println(result);
    }
}
