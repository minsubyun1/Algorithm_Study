package BOJ.Gold;

import java.util.Arrays;
import java.util.Scanner;

public class MeetingRoom {
    static class Meeting implements Comparable<Meeting> {
        int start, end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        // 종료 시간 오름차순, 같으면 시작 시간 오름차순
        @Override
        public int compareTo(Meeting o) {
            if(this.end == o.end) {
                return this.start - o.start;
            }
            return this.end - o.end;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Meeting[] meetings = new Meeting[N];

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings[i] = new Meeting(start, end);
        }

        Arrays.sort(meetings);

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < N; i++) {
            if (meetings[i].start >= endTime) {
                count++;
                endTime = meetings[i].end;
            }
        }

        System.out.println(count);
    }
}
