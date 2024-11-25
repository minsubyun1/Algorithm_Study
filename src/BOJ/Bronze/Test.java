package BOJ.Bronze;

import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int totalSum = 0;

        // 9명의 난쟁이 키 입력 및 합 계산
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        // 제외할 두 난쟁이 찾기
        boolean found = false;
        for(int i = 0; i < 8; i++){
            for(int j = i + 1; j < 9; j++){
                if(totalSum - (arr[i] + arr[j]) == 100){
                    arr[i] = -1; // 제외된 난쟁이 표시
                    arr[j] = -1;
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        Arrays.sort(arr);
        for(int i = 2; i < 9; i++){
            System.out.println(arr[i]);
        }
    }
}
