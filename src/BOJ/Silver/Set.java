package BOJ.Silver;

import java.util.HashSet;
import java.util.Scanner;
public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0; // 공집합을 비트마스크로 표현

        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder(); // 출력 속도 개선을 위한 StringBuilder

        for (int i = 0; i < N; i++) {
            String command = sc.next();

            if(command.equals("add")){
                int x = sc.nextInt();
                S |= (1 << x); // x번째 비트를 1로 설정
            } else if(command.equals("remove")){
                int x = sc.nextInt();
                S &= ~(1 << x); // x번째 비트를 0으로 설정
            } else if(command.equals("check")){
                int x = sc.nextInt();
                if((S & (1 << x)) != 0){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if(command.equals("toggle")){
                int x = sc.nextInt();
                S ^= (1 << x); // x번째 비트를 반전
            } else if(command.equals("all")){
                S = (1 << 21) - 1; // {1, 2, ..., 20}을 표현하는 비트마스크
            } else if(command.equals("empty")){
                S = 0; // 공집합으로 초기화
            }
        }
        System.out.println(sb); // 결과를 한 번에 출력
    }
}
