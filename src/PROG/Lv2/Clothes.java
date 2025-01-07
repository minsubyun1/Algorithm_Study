package PROG.Lv2;


import java.util.HashMap;

public class Clothes {
    public int solution(String[][] clothes) {
        // 의상의 종류별로 개수를 저장할 HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 의상을 종류별로 그룹화
        for (String[] cloth : clothes) {
            String category = cloth[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }

        // 조합의 수 계산
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1); // 각 종류별로 안 입는 경우(+1)를 포함
        }

        return answer - 1; // 최소 하나는 입어야 하므로 아무것도 안 입는 경우는 제외
    }
}
