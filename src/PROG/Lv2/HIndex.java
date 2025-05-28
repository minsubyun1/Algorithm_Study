package PROG.Lv2;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};


        Arrays.sort(citations); // 오름차순 정렬
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i; // citations[i] 이상인 논문 수
            if (citations[i] >= h) {
                System.out.println(h);
                return;
            }
        }

        // H-index 조건을 만족하지 않으면 0
        System.out.println(0);
    }
}
