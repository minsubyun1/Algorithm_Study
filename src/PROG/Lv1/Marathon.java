package PROG.Lv1;

import java.util.*;
public class Marathon {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> map = new HashMap();
            String answer = "";

            for(int i = 0; i < participant.length; i++){
                if(map.get(participant[i]) != null){
                    map.put(participant[i], map.get(participant[i]) + 1);
                } else {
                    map.put(participant[i] , 1);
                }
            }

            for(int i = 0; i < completion.length; i++){
                if(map.get(completion[i]) != null){
                    map.put(completion[i], map.get(completion[i]) - 1);
                }
            }

            for(String key : map.keySet()){
                if(map.get(key) != 0){
                    answer = key;
                }
            }



            return answer;
        }
    }
}
