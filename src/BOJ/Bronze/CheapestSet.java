package BOJ.Bronze;

import java.util.Scanner;
public class CheapestSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hamburger = sc.nextInt();

        for(int i = 0; i < 2; i++){
            int newHam = sc.nextInt();
            if(newHam < hamburger){
                hamburger = newHam;
            }
        }
        int bev = 0;
        int bev1 = sc.nextInt();
        int bev2 = sc.nextInt();
        if(bev1 <= bev2){
            bev = bev1;
        } else {
            bev = bev2;
        }

        System.out.println(hamburger + bev - 50);
    }
}
