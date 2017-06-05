import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start: 15:25
 * finish - 15:35
 *
 */
public class P02_Cups {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int cups = Integer.parseInt(reader.nextLine());
        int workers = Integer.parseInt(reader.nextLine());
        int workingDays = Integer.parseInt(reader.nextLine());

        double totalCups = workers* workingDays * 8 / 5;
        double extraMoneyOrLosses = Math.abs(totalCups - cups) * 4.2;
        if (cups < totalCups) {
            System.out.printf("%.2f extra money", extraMoneyOrLosses);

        } else {
            System.out.printf("Losses: %.2f", extraMoneyOrLosses);
        }
    }
}
