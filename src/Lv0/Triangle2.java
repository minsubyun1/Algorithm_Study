package Lv0;

public class Triangle2 {
    public int solution(int[] sides) {
        int answer = 0;

        int maxValue = Math.max(sides[0], sides[1]);
        int minValue = Math.min(sides[0], sides[1]);

        int highLimit = maxValue + minValue;
        int lowLimit = maxValue - minValue;

        answer = highLimit - lowLimit -1;

        return answer;
    }
}
