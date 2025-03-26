package BOJ.Silver;

import java.util.*;

public class OnDuty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();  // 이름과 상태를 저장

        // 출입 기록 처리
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String action = sc.next();

            map.put(name, action);  // 상태를 덮어쓰기
        }

        // 회사에 있는 사람들만 추출하여 사전 역순으로 출력
        List<String> result = new ArrayList<>();
        for (String name : map.keySet()) {
            if (map.get(name).equals("enter")) {
                result.add(name);
            }
        }

        // 사전 역순으로 정렬
        Collections.sort(result, Collections.reverseOrder());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
