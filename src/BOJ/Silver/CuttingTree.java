package BOJ.Silver;

import java.util.Arrays;
import java.util.Scanner;
public class CuttingTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 나무의 개수
        int M = sc.nextInt(); // 얻고 싶은 나무 높이의 합

        // 절단기 높이 H를 설정할 때, H를 높이면 가져갈 나무길이가 줄어들고
        // H를 낮추면 더 많은 나무를 가져간다.
        // 따라서 H를 조절하면서 M 이상의 나무를 가져갈 수 있는 최대값을 찾아야 한다.
        // 이분 탐색을 통해 탐색 범위를 줄여서 빠르게 해결한다.

        int[] trees = new int[N];
        int maxTreeHeight = 0;

        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
            maxTreeHeight = Math.max(maxTreeHeight, trees[i]);
        }

        int left = 0;
        int right = maxTreeHeight;
        int result = 0;

        while (left <= right){
            int mid = (left + right) / 2;
            long sum = 0;

            for (int tree: trees){
                if (tree > mid){
                    sum += tree - mid;
                }
            }

            if (sum >= M){ // 나무 길이가 충분하면, 절단기 높이를 더 높일 수 있음
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }


        }
        System.out.println(result);
    }
}
