package Lv0;

public class SumOfConsecutiveNumbers {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int a = 0;
        int count = 0;

        for(int i = 0; i < answer.length; i++){
            a = a + i;
        }


        int x = (total-a) / num;


        for(int i = 0; i < answer.length; i++){
            answer[i] = x++;
        }


        return answer;
    }
}
