package PROG.Lv0;

public class FindNearestOne {
    public int solution(int[] arr, int idx) {
        int answer = 0;

        for(int i = 0; i < arr.length; i++){
            if(i >= idx && arr[i] == 1){
                if(answer < 1){
                    answer = i;
                    break;
                }
            } else {
                answer = -1;
            }
        }



        return answer;
    }
}
