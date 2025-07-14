import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {
    public int solution(String numbers) {
        Set<Integer> comb = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];

        backtrack(numbers, "", visited, comb);

        int count = 0;
        for (int num : comb) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }


    private void backtrack(String numbers, String current, boolean[] visited, Set<Integer> comb) {
        if (!current.isEmpty()) {
            comb.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtrack(numbers, current + numbers.charAt(i), visited, comb);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}