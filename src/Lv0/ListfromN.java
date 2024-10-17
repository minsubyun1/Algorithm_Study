package Lv0;
import java.util.*;
public class ListfromN {
    public int[] solution(int[] num_list, int n) {

        ArrayList<Integer> result_list = new ArrayList<>();

        for(int i = n-1; i < num_list.length; i++){
            result_list.add(num_list[i]);
        }

        int[] answer = new int[result_list.size()];

        for(int j = 0; j < answer.length; j++){
            answer[j] = result_list.get(j);
        }

        return answer;
    }
}
