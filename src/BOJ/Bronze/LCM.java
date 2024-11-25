package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class LCM {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();

                int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수

                for(int i = 0; i < N; i++){
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());

                    // 최소공배수 계산
                    int lcm = (a / GCD(a, b)) * b;
                    sb.append(lcm).append("\n");
                }

                System.out.println(sb); // 출력
            }

            private static int GCD(int a, int b){
                while(b != 0){
                    int temp = b;
                    b = a % b;
                    a = temp;
                }

                return a;
            }

    }
