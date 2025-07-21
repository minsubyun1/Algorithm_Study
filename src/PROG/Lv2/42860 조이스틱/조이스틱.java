public class 조이스틱 {
    public static void main(String[] args) {
        String name = "JAZ";
        int answer = 0;
        int length = name.length();

        // 위아래 최소 이동
        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);
            answer += Math.min(ch - 'A', 'Z' - ch + 1);
        }

        // 좌우 최소 이동 탐색
        int move = length - 1; // 중간에 A 없이 기본 오른쪽으로만 갔을 경우
        for (int i = 0; i < length; i++) {
            int next = i + 1;
            while(next < length && name.charAt(next) == 'A'){
                next++;
            }

            // i까지 갔다가 돌아오고, 남은 부분을 다시 가는 경우
            move = Math.min(move, i + i + (length - next));

            // 반대 방향으로 먼저 가는 경우
            move = Math.min(move, (length - next) * 2 + i);
        }

        System.out.println(answer + move);
    }
}