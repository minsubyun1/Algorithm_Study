package BOJ.Gold;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class LineUp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 인접 리스트
        int[] indegree = new int[N + 1]; // 진입 차수 배열

        // 그래프 초기화
        for (int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        // 관계 입력 받기
        for (int i = 0; i < M; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            graph.get(A).add(B); // A -> B 관계 설정
            indegree[B]++; // B의 진입 차수 증가
        }

        // 위상 정렬을 위한 큐
        Queue<Integer> queue = new LinkedList<>();

        // 진입 차수가 0인 노드를 큐에 넣음
        for (int i = 1; i <= N; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        // 위상 정렬 실행
        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.println(current + " "); // 출력

            // 현재 노드와 연결된 노드의 진입 차수를 줄임
            for (int next : graph.get(current)){
                indegree[next]--;
                if(indegree[next] == 0){ // 진입 차수가 0이 되면 큐에 추가
                    queue.add(next);
                }
            }
        }
    }
}
