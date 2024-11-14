package BOJ.Bronze;

import java.util.*;

public class ACMHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = N % H == 0 ? H : N % H; // 층 번호 계산
            int room = (N - 1) / H + 1; // 방 번호 계산

            int answer = floor * 100 + room; // 방 번호 형식 맞추기
            arr.add(answer);
        }

        for (Integer i : arr) {
            System.out.println(i);
        }



    }
}
