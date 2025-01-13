package BOJ.Silver;

import java.util.ArrayList;
import java.util.Scanner;
public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num == 0){
                if(!arr.isEmpty()){
                    arr.remove(arr.size() - 1);
                }
            } else {
                arr.add(num);
            }
        }
        int sum = 0;

        for (Integer i : arr) {
            sum += i;
        }

        System.out.println(sum);
    }
}
