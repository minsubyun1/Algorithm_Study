import java.util.Arrays;
public class 구명보트 {
    public static void main(String[] args) {
        int[] people = {110, 120, 130, 140};
        int limit = 150;
        int answer = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        while(left <= right){
            if(people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            answer++;
        }

        System.out.println(answer);
    }
}