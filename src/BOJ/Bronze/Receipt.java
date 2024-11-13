package BOJ.Bronze;

import java.util.Scanner;
public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int paperTotal = sc.nextInt();
        int N = sc.nextInt();

        int actualTotal = 0;

        for(int i = 0; i < N; i++){
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            actualTotal += price * quantity;
        }

        if(paperTotal == actualTotal){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
