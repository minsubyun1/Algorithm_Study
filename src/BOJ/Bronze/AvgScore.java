package BOJ.Bronze;
import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int avg = 0;
        for(int i = 0; i < 5; i++){
            int score = sc.nextInt();
            if(score < 40){
                score = 40;
            }
            avg += score;
        }
        avg /= 5;
        System.out.println(avg);
    }
}
