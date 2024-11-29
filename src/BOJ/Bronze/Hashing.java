package BOJ.Bronze;

import java.util.Scanner;
import java.util.Objects;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); // 문자열 길이
        String str = sc.next(); // 문자열 입력

        final int R = 31; // 거듭제곱의 밑
        final int M = 1234567891; // 모듈로 값

        long hashValue = 0; // 최종 해시 값
        long power = 1; // R^i 값을 저장


        for (int i = 0; i < L; i++) {
            int charValue = str.charAt(i) - 'a' + 1; // 문자 -> 숫자 변환
            hashValue += (charValue * power) % M; // 현재 문자에 대한 해시값 추가
            power = (power * R) % M; // 다음 R ^ i 값 계산
        }

        System.out.println(hashValue); // 최종 해시값 출력
    }
}
