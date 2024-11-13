package PROG.Lv0;

public class SequenceSectionQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];



        for(int i = 0; i< queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            // 32비트로 표현할 수 있는 최대 정수

            int min = Integer.MAX_VALUE;
            for(int j = s; j <=e; j++){
                if(arr[j] > k && arr[j] < min){
                    min = arr[j];
                }
            }
            answer[i] = min == Integer.MAX_VALUE ? -1 : min;
        }



        return answer;
    }
}
