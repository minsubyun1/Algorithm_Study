package BOJ.Gold;

import java.util.Scanner;
public class Z {
    static int count;
    static int r, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        r = sc.nextInt(); // 행
        c = sc.nextInt(); // 열

        int size = (int)Math.pow(2, N);

        solve(0, 0, size);

    }

    static void solve(int x, int y, int size){
        if (size == 1){
            System.out.println(count);
            return;
        }

        int half = size / 2;

        // 왼쪽 위
        if (r < x + half && c < y + half){
            solve(x, y, half);
        }

        // 오른쪽 위
        else if (r < x + half && c >= y + half){
            count += half * half;
            solve(x, y + half, half);
        }

        // 왼쪽 아래
        else if(r >= x + half && c < y + half){
            count += half * half * 2;
            solve(x + half, y, half);
        }

        else {
            count += half * half * 3;
            solve(x + half, y + half, half);
        }
    }


}
