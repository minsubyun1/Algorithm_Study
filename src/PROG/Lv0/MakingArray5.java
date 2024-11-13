package PROG.Lv0;
import java.util.*;
public class MakingArray5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> answer_list = new ArrayList<>();


        for(int i = 0; i < intStrs.length; i++){
            int extracted_num = Integer.parseInt(intStrs[i].substring(s, l+s));
            if(extracted_num > k){
                answer_list.add(extracted_num);
            }

        }

        int[] answer = new int[answer_list.size()];

        for(int j = 0; j < answer.length; j++){
            answer[j] = answer_list.get(j);
        }


        return answer;
    }
}
