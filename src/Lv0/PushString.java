package Lv0;

public class PushString {
    public int solution(String A, String B) {
        int answer = 0;
        String cp = A;

        for(int i = 0; i < A.length(); i++){
            if(cp.equals(B)){
                return answer;
            }
            String a = cp.substring(cp.length() - 1); // 끝글자
            cp = a + cp.substring(0, cp.length() - 1); //끝글자 + 끝글자 전
            answer++;
        }

        return -1;
    }
}
