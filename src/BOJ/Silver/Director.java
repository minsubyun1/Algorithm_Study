package BOJ.Silver;

import java.util.Scanner;
public class Director {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num = 666;
        int count = 0;

        while(true){
            if(String.valueOf(num).contains("666")){
                count++; // 종말의 수를 찾을 때마다 증가
            }

            if (count == N){
                break; // N번째 종말의 수를 찾으면 종료
            }
            num++;
        }

        System.out.println(num);
    }
}
