package BOJ.Bronze;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            String str = String.valueOf(n);
            String reversed_str = new StringBuilder(str).reverse().toString();

            if(str.equals(reversed_str)){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }

}
