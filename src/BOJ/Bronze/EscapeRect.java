package BOJ.Bronze;

import java.util.Scanner;

public class EscapeRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int maxX = 0;
        int maxY = 0;
        if((Math.abs(x-w)) < (Math.abs(x))){
            maxX = Math.abs(x-w);
        } else {
            maxX = x;
        }

        if((Math.abs(y-h)) < (Math.abs(y))){
            maxY = Math.abs(y-h);
        } else {
            maxY = y;
        }

        if(maxX < maxY){
            System.out.println(maxX);
        } else {
            System.out.println(maxY);
        }
    }
}
