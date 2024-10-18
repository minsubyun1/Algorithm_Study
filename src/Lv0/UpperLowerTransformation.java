package Lv0;
import java.util.*;
public class UpperLowerTransformation {
    public String solution(String my_string) {
        int tmp = 0;

        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            tmp = (int)my_string.charAt(i); // 아스키코드 숫자로 저장됨.
            if((65 <= tmp) && (tmp <= 90)){ // 대문자인 경우
                answer += (char)(tmp + 32);
                // 32 더해서 소문자로 변환
            } else if((97 <= tmp) && (tmp <= 122)){ // 소문자인 경우
                answer += (char)(tmp - 32); // 32를 빼서 대문자로 변환
            }
        }

        return answer;
    }
}
