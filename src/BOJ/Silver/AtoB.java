package BOJ.Silver;

import java.util.*;
public class AtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(bfs(A, B));
    }

    public static int bfs(long A, long B){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(A, 1)); // 시작 수, 연산 횟수 (시작 포함)

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            if (now.num == B) {
                return now.count;
            }

            long next1 = now.num * 2;
            long next2 = now.num * 10 + 1;

            if (next1 <= B) queue.add(new Node(next1, now.count + 1));
            if (next2 <= B) queue.add(new Node(next2, now.count + 1));
        }

        return -1;
    }

    static class Node {
        long num;
        int count;

        public Node(long num, int count) {
            this.num = num;
            this.count = count;
        }
    }
}
