package BOJ.Silver;

import java.util.*;

public class NM9 {
    static int[] arr;
    static int[] sequence; // 현재 수열 저장
    static boolean[] used; // 방문 여부 체크
    static int N;
    static int M;
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M]; // M개 선택할 배열
        used = new boolean[N + 1];

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        used = new boolean[N];
        dfs(0);

    }

    static void dfs(int depth){
        if (depth == M) { // M개 선택 완료
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        int prev = -1; // 직전 수 저장 (중복 방지)
        for (int i = 0; i < N; i++) {
            if(!used[i] && arr[i] != prev){ // 아직 사용하지 않은 숫자인 경우
                used[i] = true; // 방문 체크
                sequence[depth] = arr[i]; // 현재 depth에 숫자 저장
                prev = arr[i]; // 이번 수 기억
                dfs(depth + 1); // 다음 숫자 선택하러 이동
                used[i] = false; // 백트래킹: 사용했던 숫자 되돌리기
            }
        }
    }
}
