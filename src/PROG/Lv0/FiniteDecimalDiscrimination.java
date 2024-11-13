package PROG.Lv0;

public class FiniteDecimalDiscrimination {
    public int solution(int a, int b) {

        // 기약분수 -> 더이상 나뉘지 않는 분수
        int finalNum = b / GCD(a, b);

        while(finalNum != 1){
            if(finalNum % 2 == 0){
                finalNum /= 2;
            } else if (finalNum % 5 == 0){
                finalNum /= 5;
            } else {
                return 2;
            }
        }

        return 1;

    }

    // 유클리드 호제법 사용
    // 유클리드 호제법: 두 수의 최대공약수를 구하는 공식

    private int GCD(int a, int b){
        if(b == 0){
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}

