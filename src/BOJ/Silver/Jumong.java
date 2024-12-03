package BOJ.Silver;

import java.util.Arrays;
import java.util.Scanner;
public class Jumong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 투 포인터 사용
        int left = 0;
        int right = N - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == M){ // 갑옷 제작 가능한 경우
                count++;
                left++;
                right--;
            } else if(sum < M){ // 합이 작으면 왼쪽 포인터 이동
                left++;
            } else { // 합이 크면 오른쪽 포인터 이동
                right--;
            }
        }
        System.out.println(count);
    }

}
