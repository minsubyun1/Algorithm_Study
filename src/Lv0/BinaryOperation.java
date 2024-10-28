package Lv0;

public class BinaryOperation {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int fir = Integer.parseInt(bin1, 2);
        int sec = Integer.parseInt(bin2, 2);
        int result = fir + sec;

        answer = Integer.toBinaryString(result);

        return answer;
    }
}
