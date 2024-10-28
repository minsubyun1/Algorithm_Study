package Lv0;

public class ChickenCoupon {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int rest = 0;

        while(coupon >= 10){
            rest = coupon % 10;
            answer += coupon / 10;
            coupon = rest + coupon / 10;
        }

        return answer;
    }
}
