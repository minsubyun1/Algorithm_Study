package Lv0;

public class OXQuiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] s = quiz[i].split(" ");
            int num = Integer.parseInt(s[0]);

            if(s[1].equals("+")){
                num += Integer.parseInt(s[2]);
            }
            if(s[1].equals("-")){
                num -= Integer.parseInt(s[2]);
            }

            if(num == Integer.parseInt(s[4])){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}
