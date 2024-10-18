package Lv0;

public class AgeofAlphabet {
    public String solution(int age) {
        String answer = "";
        String comp_str = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");

        for(int i = 0; i < ageArr.length; i++){
            answer += comp_str.charAt(Integer.valueOf(ageArr[i]));
        }

        return answer;
    }
}
