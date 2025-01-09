package BOJ.Silver;

import java.util.Scanner;

public class SugarDelivery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0; // 봉지 개수

        while(true){
            if(N % 5 == 0){ // 5로 나누어 떨어지면
                count += N / 5;
                break;
            }
            N -= 3; // 그렇지 않으면 3kg 봉지를 하나 추가
            count++;

            if (N < 0){ // 정확히 나눌 수 없는 경우
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
