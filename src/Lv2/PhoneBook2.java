package Lv2;

import java.util.HashMap;
public class PhoneBook2 {
    class Solution {
        public boolean solution(String[] phone_book) {
            HashMap<String, Integer> map = new HashMap<>();

            // 전화번호 목록을 해시맵에 저장
            for (String phone : phone_book) {
                map.put(phone, 1);
            }

            // 각 전화번호의 접두어를 해시맵에서 검색
            for (String phone : phone_book) {
                for (int i = 1; i < phone.length(); i++) {
                    if (map.containsKey(phone.substring(0, i))) {
                        return false; // 접두어가 존재하면 false 반환
                    }
                }
            }

            return true; // 접두어가 없으면 true 반환
        }
    }
}
