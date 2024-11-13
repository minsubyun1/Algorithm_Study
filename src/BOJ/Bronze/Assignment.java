package BOJ.Bronze;

import java.util.ArrayList;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> students = new ArrayList<>();

        // 1부터 30까지의 출석번호를 ArrayList에 추가
        for (int i = 1; i <= 30; i++) {
            students.add(i);
        }

        // 28명의 제출자 번호 입력 및 ArrayList에서 해당 번호 제거
        for(int i = 0; i < 28; i++){
            int submitted = sc.nextInt();
            students.remove(Integer.valueOf(submitted));
        }

        // 남아 있는 두 번호 출력
        System.out.println(students.get(0));
        System.out.println(students.get(1));


        sc.close();
    }
}
