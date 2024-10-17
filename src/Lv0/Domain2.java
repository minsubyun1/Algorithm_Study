package Lv0;

public class Domain2 {
    public int[] solution(int[] arr) {

        int start_index = -1;
        int end_index = -1;


        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                start_index = i;
                break;
            }
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 2){
                end_index = i;
            }
        }

        int[] answer = new int[end_index - start_index + 1];
        int idx = 0;

        if(start_index == -1){
            answer[idx] = -1;
        } else {

            for (int i = start_index; i <= end_index; i++){
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}
