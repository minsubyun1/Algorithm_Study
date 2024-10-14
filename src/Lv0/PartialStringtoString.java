package Lv0;
import java.util.*;
public class PartialStringtoString {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < parts.length; i++){
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }

        answer = sb.toString();

        return answer;
    }
}
