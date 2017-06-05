import java.util.Scanner;

/**
 * Created by sineochk on 24.4.2017 г..
 * 17:45 - start
 * 18:00 - finish
 */
public class p04_Bills {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int months = Integer.parseInt(reader.nextLine());
        double water = 20 * months;
        double internet = 15 * months;

        double electricity = 0;
        for (int i = 0; i < months; i++) {
            double electricityPerMonth = Double.parseDouble(reader.nextLine());
            electricity = electricity + electricityPerMonth;
        }

        double others = (electricity + water + internet) * 1.2;
        double average = (electricity+water+internet+others) / months;

        System.out.printf("Electricity: %.2f lv" +System.getProperty("line.separator") , electricity );
        System.out.printf("Water: %.2f lv"+System.getProperty("line.separator"), water);
        System.out.printf("Internet: %.2f lv"+System.getProperty("line.separator"), internet);
        System.out.printf("Other: %.2f lv"+System.getProperty("line.separator"), others);
        System.out.printf("Average: %.2f lv"+System.getProperty("line.separator"), average);
    }
}
