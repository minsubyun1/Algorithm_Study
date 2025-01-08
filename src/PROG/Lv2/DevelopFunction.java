package PROG.Lv2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopFunction {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = solution(progresses, speeds);
        for (int count : answer) {
            System.out.println(count);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();

        // 각 작업의 남은 작업일수를 계산하여 큐에 추가
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingWork / speeds[i]);
            daysQueue.add(days);
        }

        // 배포 그룹을 계산
        while (!daysQueue.isEmpty()) {
            int currentDay = daysQueue.poll();
            int count = 1;

            // 현재 작업 기준으로 뒤의 작업들을 확인
            while (!daysQueue.isEmpty() && daysQueue.peek() <= currentDay) {
                daysQueue.poll();
                count++;
            }

            result.add(count);
        }

        // 결과를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
