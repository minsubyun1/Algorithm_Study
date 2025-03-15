package BOJ.Silver;

import java.util.*;

public class NM12 {
    static int[] sequence, numbers;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[N];
        sequence = new int[M];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        dfs(0, 0);
    }

    static void dfs(int depth, int start) {
        if (depth == M) { // M개 선택 완료
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < N; i++) {

            // 중복된 숫자가 나오지 않도록 처리
            if (i > start && numbers[i] == numbers[i - 1]){
                continue; // 이전과 동일한 숫자는 건너뛰기
            }

            sequence[depth] = numbers[i]; // 현재 숫자 선택
            dfs(depth + 1, i); // i + 1이 아니니까 같은 숫자도 가능
        }
    }
}
