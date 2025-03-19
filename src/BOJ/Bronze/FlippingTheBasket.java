package BOJ.Bronze;

import java.util.Scanner;
public class FlippingTheBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        // 배열에 1부터 N까지 숫자 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // M번 만큼 범위 역순
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            // 배열 인덱스를 0-based로 변경하여 처리
            start--;
            end--;

            // start와 end가 같거나 start가 end보다 크지 않도록 범위 역순 처리
            while (start < end) {
                // swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        // 결과 출력
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
