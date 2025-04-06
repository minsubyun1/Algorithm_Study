package BOJ.Silver;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Set;
public class SymmetricDifference {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a_size = Integer.parseInt(st.nextToken());
        int b_size = Integer.parseInt(st.nextToken());


        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        // 집합 A 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a_size; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        // 집합 B 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b_size; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        // 대칭 차집합 계산: (A-B) + (B -A)
        Set<Integer> symmetricDiff = new HashSet<>(aSet);
        symmetricDiff.addAll(bSet); // A U B
        symmetricDiff.removeAll(intersection(aSet, bSet));

        System.out.println(symmetricDiff.size());
    }

    // A ∩ B 교집합 구하기
    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2); // 교집합만 남김
        return result;
    }
}
