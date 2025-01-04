package BOJ.Silver;

import java.util.*;
public class SortByAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 개행문자 처리

        // 회원 정보를 저장할 리스트
        List<Member> members = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members.add(new Member(age, name, i));
        }

        // 정렬: 나이를 기준으로 정렬, 나이가 같으면 가입 순서 기준
        members.sort(Comparator.comparingInt((Member m) -> m.age)
                .thenComparingInt(m -> m.order));

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }



    static class Member{
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}
