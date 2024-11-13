package PROG.Lv0;

public class ThreeSixNineGame {
    public int solution(int order) {
        int num = 0;


        int answer = 0;

        while(order > 0){

            num = order % 10;
            System.out.println(num);
            if(num != 0 && num % 3 == 0){
                answer++;
            }

            order = order / 10;

        }

        return answer;
    }
}
