package Lv0;
import java.util.*;
public class AtoB {
    public int solution(String before, String after) {
        int answer = 0;
        String[] str1 = new String[before.length()];
        String[] str2 = new String[after.length()];

        for(int i = 0; i < before.length(); i++){
            str1[i] = String.valueOf(before.charAt(i));
            str2[i] = String.valueOf(after.charAt(i));
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        int count = 0;

        for(int j = 0; j < str1.length; j++){
            if(str1[j].equals(str2[j])){
                count++;
            }
        }

        if(count == str1.length){
            answer = 1;
        }

        return answer;
    }
}
