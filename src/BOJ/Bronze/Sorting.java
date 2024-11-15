package BOJ.Bronze;


import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
