package PROG.Lv0;

public class TheNumberOfK {
    public int solution(int i, int j, int k) {
        int answer = 0;

        String strK = String.valueOf(k);

        for(int a = i; a <= j; a++){
            String str = String.valueOf(a);
            if(str.contains(strK)){
                String[] strArr = str.split("");
                for(int b = 0; b < strArr.length; b++){
                    if(strArr[b].equals(strK)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
