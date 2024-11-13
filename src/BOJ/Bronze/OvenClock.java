package BOJ.Bronze;

import java.util.Scanner;
public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int addition = sc.nextInt();

        minute += addition;

        if(minute >= 60){
            hour += minute / 60;
            minute %= 60;
        }
        if(hour >= 24){
            hour %= 24;
        }
        System.out.println(hour + " " + minute);
    }
}
