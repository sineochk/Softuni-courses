import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start: 13:50
 * finish: 14:08
 */
public class p04_Grades {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int students = Integer.parseInt(reader.nextLine());
        int excellent = 0;
        int good = 0;
        int average = 0;
        int fail = 0;
        double grades = 0;

        for (int i = 0; i < students ; i++) {
            double grade = Double.parseDouble(reader.nextLine());
            if (grade >= 5.0) {
                excellent++;
            }else if (grade >= 4.0) {
                good++;
            }else if (grade >= 3.0) {
                average++;
            }else{
                fail++;
            }
            grades += grade;
        }
        System.out.printf("Top students: %.2f%%\n" , (excellent / (double)students) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", (good / (double)students) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", (average / (double)students) * 100);
        System.out.printf("Fail: %.2f%%\n", (fail / (double)students) * 100);
        System.out.printf("Average: %.2f", grades / students);

    }
}
