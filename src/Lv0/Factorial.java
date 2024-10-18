package Lv0;

public class Factorial {
    public int solution(int n) {
        int answer = 1;
        int fact = 1;
        int num = 1;
        while(fact <= n){
            fact *= num++;
        }

        num = num - 2;
        answer = num;

        return answer;
    }
}
