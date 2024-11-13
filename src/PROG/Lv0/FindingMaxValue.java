package PROG.Lv0;
import java.util.*;
public class FindingMaxValue {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];

        return answer;
    }
}
