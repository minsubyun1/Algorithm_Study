package BOJ.Silver;

import java.util.*;

public class MergeSort1 {
    static int N, K, count = 0, result = -1;
    static int[] A, tmp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        A = new int[N];
        tmp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        mergeSort(0, N - 1);
        System.out.println(result);


    }

    public static void mergeSort(int start, int end){
        if (start < end){
            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    public static void merge(int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int t = 0;

        // 병합
        while (i <= mid && j <= end){
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }

        while (i <= mid){
            tmp[t++] = A[i++];
        }
        while(j <= end) {
            tmp[t++] = A[j++];
        }

        // tmp -> A로 복사 (여기가 저장 시점)
        i = start;
        t = 0;

        while (i <= end){
            A[i] = tmp[t];
            count++;
            if (count == K){
                result = A[i];
                return;
            }
            i++;
            t++;
        }
    }
}

