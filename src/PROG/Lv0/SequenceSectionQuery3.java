package PROG.Lv0;

public class SequenceSectionQuery3 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        // 입출력 예를 참고하면, queries 2차원 배열의 각 차원에 속한 원소 값들이 arr 배열에서의 위치를 의미하는 것을 확인할 수 있다.
        // 즉 queries에 나온 위치 값에 따라 arr의 i와 j 위치의 값을 변경하는 것이다.

        int temp = 0;

        for(int i = 0; i < queries.length; i++){
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }

        answer = arr;


        return answer;
    }
}
