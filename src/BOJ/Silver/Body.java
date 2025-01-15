package BOJ.Silver;

import java.util.Scanner;

public class Body {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] hg = new int[N];
        int[] wg = new int[N];

        for (int i = 0; i < N; i++){
            hg[i] = sc.nextInt();
            wg[i] = sc.nextInt();
        }

        int rank = 1;

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(hg[i] < hg[j] && wg[i] < wg[j]){
                    rank++;
                }
            }
            System.out.print(rank + " ");
            rank = 1;
        }
    }

}
