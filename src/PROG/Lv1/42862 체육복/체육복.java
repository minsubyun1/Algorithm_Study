import java.util.*;


public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int l : lost) lostSet.add(l);
        for (int r : reserve) reserveSet.add(r);

        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r);
                reserveSet.remove(r);
            }
        }

        List<Integer> lostList = new ArrayList<>(lostSet);
        Collections.sort(lostList);

        for (int l : lostList) {
            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
            } else {
                n--;
            }
        }

        return n;
    }
}