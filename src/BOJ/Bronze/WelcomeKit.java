package BOJ.Bronze;

import java.util.Scanner;
public class WelcomeKit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] shirtRequests = new int[6];

        for(int i = 0; i < shirtRequests.length; i++){
            shirtRequests[i] = sc.nextInt();
        }

        int T = sc.nextInt();
        int P = sc.nextInt();


        // 1. 티셔츠 묶음 계산
        int totalShirtBundles = 0;
        for (int shirtRequest : shirtRequests) {
            totalShirtBundles += (shirtRequest + T - 1) / T; // 올림 계산
        }

        System.out.println(totalShirtBundles);

        // 2. 펜 묶음과 남는 개수 계산
        int penBundles = N / P;
        int singleBundles = N % P;
        System.out.println(penBundles + " " + singleBundles);



    }
}
