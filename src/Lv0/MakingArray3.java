package Lv0;
import java.util.*;

public class MakingArray3 {
    public int[] solution(int[] arr, int[][] intervals) {

        ArrayList<Integer> num_list = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                num_list.add(arr[j]);
            }
        }

        int[] answer = new int[num_list.size()];

        for (int p = 0; p < answer.length; p++){
            answer[p] = num_list.get(p);
        }

        return answer;
    }
}
