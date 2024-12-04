package BOJ.Silver;


import java.util.Scanner;
public class DNAPassword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 입력
        int S = sc.nextInt(); // DNA 문자열 길이
        int P = sc.nextInt(); // 비밀번호로 사용할 부분 문자열 길이
        String dna = sc.next(); // DNA 문자열
        int[] required = new int[4]; // 최소 요구되는 A, C, G, T 개수 배열
        for(int i = 0; i < 4; i++){
            required[i] = sc.nextInt();
        }

        // 슬라이딩 윈도우 초기화
        int[] count = new int[4]; // 현재 윈도우의 A, C, G, T
        int result = 0;

        // 첫 윈도우 개수 카운팅
        for(int i = 0; i < P; i++){
            addCount(dna.charAt(i), count);
        }

        // 첫 윈도우 조건 체크
        if(isValid(count, required)){
            result++;
        }

        // 슬라이딩 윈도우
        for(int i = P; i < S; i++){
            // 윈도우 이동: 왼쪽 문자 제거, 오른쪽 문자 추가
            removeCount(dna.charAt(i - P), count);
            addCount(dna.charAt(i), count);

            // 조건 만족 검사
            if(isValid(count, required)){
                result++;
            }
        }
        System.out.println(result);
    }


    // 현재 윈도우가 조건을 만족하는지 검사
    private static boolean isValid(int[] count, int[] required){
        for(int i = 0; i < 4; i++){
            if(count[i] < required[i]){
                return false;
            }
        }
        return true;
    }

    // 문자를 추가할 때 count 배열 업데이트
    private static void addCount(char c, int[] count){
        switch(c){
            case 'A': count[0]++; break;
            case 'C': count[1]++; break;
            case 'G': count[2]++; break;
            case 'T': count[3]++; break;
        }
    }

    // 문자를 제거할 때 count 배열 업데이트
    private static void removeCount(char c, int[] count){
        switch(c){
            case 'A': count[0]--; break;
            case 'C': count[1]--; break;
            case 'G': count[2]--; break;
            case 'T': count[3]--; break;
        }
    }
}
