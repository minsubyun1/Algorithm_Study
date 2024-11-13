package PROG.Lv0;
import java.util.*;
public class PrimeFactorization {
    public int[] solution(int n) {
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(n % i ==0){
                while(n % i == 0){
                    n = n / i;
                }
                array.add(i);
            }
        }

        int[] answer = new int[array.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}
