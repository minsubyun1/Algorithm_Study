package PROG.Lv2;

import java.util.HashMap;
public class PhoneBook2 {
    class Solution {
        public boolean solution(String[] phone_book) {
            HashMap<String, Boolean> map = new HashMap<>();

            // 각 번호와 그 접두어들을 해시맵에 저장
            for (String phone : phone_book) {
                for (int i = 1; i < phone.length(); i++) {
                    String prefix = phone.substring(0, i);
                    map.put(prefix, true);  // 접두어로 사용할 문자열 저장
                }
            }

            // 각 번호가 다른 번호의 접두어로 사용되었는지 확인
            for (String phone : phone_book) {
                if (map.containsKey(phone)) {
                    return false;  // 번호 자체가 접두어로 사용되었다면 false 반환
                }
                map.put(phone, true);  // 번호 자체를 해시맵에 추가
            }

            return true;  // 접두어 관계가 없다면 true 반환
        }
    }
}
