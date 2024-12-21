package BOJ.Silver;


import java.io.*;
import java.util.StringTokenizer;

public class pratice{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int[] L = new int[N];
        L[0] = A[0];
        int result = L[0];
        for (int i = 1; i < N; i++){
            L[i] = Math.max(A[i], L[i-1] + A[i]);
            result = Math.max(result, L[i]); // 연속된 수를 뽑는데 중간에 식별
        }

        int[]R = new int[N];
        R[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--){
            R[i] = Math.max(A[i], R[i+1] + A[i]);
        }

        // 마나를 뺼 수 있음
        for(int i = 1; i < N - 1; i++){
            int temp = L[i - 1] + R[i + 1]; // 수열에서 i번째 수를 하나빼고 만들 수 있음
            result = Math.max(result, temp);
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}