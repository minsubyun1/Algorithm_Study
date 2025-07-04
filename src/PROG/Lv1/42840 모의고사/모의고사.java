import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] fir_arr = {1,2,3,4,5};
        int[] sec_arr = {2,1,2,3,2,4,2,5};
        int[] third_arr = {3,3,1,1,2,2,4,4,5,5};

        int fir_count = 0, sec_count = 0, third_count = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == fir_arr[i % fir_arr.length]) fir_count++;
            if (answers[i] == sec_arr[i % sec_arr.length]) sec_count++;
            if (answers[i] == third_arr[i % third_arr.length]) third_count++;
        }

        int max = Math.max(fir_count, Math.max(sec_count, third_count));

        List<Integer> list = new ArrayList<>();
        if (fir_count == max) list.add(1);
        if (sec_count == max) list.add(2);
        if (third_count == max) list.add(3);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}