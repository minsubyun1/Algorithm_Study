package BOJ.Silver;

import java.util.HashSet;
import java.util.Scanner;
public class FindNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N개의 수 입력
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++){
            set.add(sc.nextInt()); // HashSet에 저장
        }

        // M개의 수 입력
        int M = sc.nextInt();
        for (int i = 0; i < M; i++){
            int num = sc.nextInt();
            if(set.contains(num)){ // 존재 여부 확인
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
