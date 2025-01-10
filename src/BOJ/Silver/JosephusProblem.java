package BOJ.Silver;

import java.util.*;

public class JosephusProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        // Queue를 사용한 순환 구조 구현
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        // 요세푸스 순열 저장할 리스트
        List<Integer> result = new LinkedList<>();

        // 큐에서 K번째 사람을 제거
        while(!queue.isEmpty()){
            // K-1번 앞, 즉 K번째 숫자로 보냄
            for(int i = 0; i < K - 1; i++){
                queue.add(queue.poll());
            }
            //k번째 사람 제거 및 결과에 추가
            result.add(queue.poll());
        }

        // 결과 출력
        System.out.print("<");
        for (int i = 0; i < result.size(); i++){
            if(i == result.size() - 1){
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.print(">");

    }
}
