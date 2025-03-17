package BOJ.Silver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AvgGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double sum = 0;
        double credit_sum = 0;

        for (int i = 0; i < 20; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            double credit = Double.parseDouble(parts[1]);
            String grade = parts[2];
            if(grade.equals("P")){
                continue;
            }

            credit_sum += credit;
            sum += map.get(grade) * credit;
        }


        System.out.printf("%.6f\n", sum / credit_sum);


    }
}
