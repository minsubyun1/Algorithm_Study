package BOJ.Bronze;

import java.util.Scanner;
public class DayOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        // 2007년의 각 월의 일수
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 요일 배열
        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        // 입력받은 날짜까지의 누적 일수 계산
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++){
            totalDays += daysInMonth[i];
        }

        totalDays += day - 1; // 입력받은 날의 하루를 제외한 누적 일수

        // 요일 계산
        String result = daysOfWeek[totalDays % 7];
        System.out.println(result);

    }
}
