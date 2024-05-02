package Lv0;

public class NumberTransformation2 {
    public String solution(int[] numLog) {
        String answer = "";
        // 주의할 점은 인덱스가 1부터 시작해야 한다는 것.
        for (int i = 1; i < numLog.length; i++){
            if(numLog[i] - 1 == numLog[i-1]){
                answer += "w";
            } else if(numLog[i] + 1 == numLog[i-1]){
                answer += "s";
            } else if(numLog[i] - 10 == numLog[i-1]){
                answer += "d";
            } else {
                answer += "a";
            }
        }

        return answer;
    }
}
