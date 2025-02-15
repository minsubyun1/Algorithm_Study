package BOJ.Silver;

import java.util.*;

public class CoordinateCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int[] arr = new int[N]; // 원본 배열
        int[] sortedArr = new int[N]; // 정렬용 배열

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i]; // 복사본 저장
        }

        // 1. 정렬 후 중복 제거
        Arrays.sort(sortedArr);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int num : sortedArr){
            if(!map.containsKey(num)){ // 중복 제거
                map.put(num, rank++);
            }
        }

        // 2. 원래 배열에 대해 압축된 값 출력
        for(int num : arr){
            System.out.print(map.get(num) + " ");
        }
    }
}
