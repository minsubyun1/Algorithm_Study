package PROG.Lv0;
import java.util.*;
public class UnusualSorting {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);

        int[] answer = new int[numlist.length];
        int prevDistance = 0;
        int nextDistance = 0;

        for(int i = 0; i < numlist.length; i++){
            for(int j = 0; j < numlist.length; j++){
                prevDistance = Math.abs(numlist[i] - n);
                nextDistance = Math.abs(numlist[j] - n);
                if(prevDistance <= nextDistance){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        for(int i = 0; i < numlist.length; i++){
            answer[i] = numlist[i];
        }


        return answer;
    }
}
