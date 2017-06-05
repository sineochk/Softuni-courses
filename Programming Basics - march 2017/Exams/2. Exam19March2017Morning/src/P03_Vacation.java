import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start: 15:42
 * finish: 16:12
 */
public class P03_Vacation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double budget = Double.parseDouble(reader.nextLine());
        String season = reader.nextLine();
        String location;
        String country;
        double spentMoney = 0;

        if (season.equals("Summer")) {
            country = "Alaska";
        } else {
            country = "Morocco";
        }
        if (budget <= 1000) {
            location = "Camp";
            if (season.equals("Summer")) {
                spentMoney =budget * 0.65;
            } else if (season.equals("Winter")) {
                spentMoney = budget * 0.45;
            }
        }
        else if (budget <= 3000) {
            location = "Hut";
            if (season.equals("Summer")) {
                spentMoney = budget * 0.8;
            } else if (season.equals("Winter")) {
                spentMoney = budget * 0.6;
            }
        } else {
            location = "Hotel";
            spentMoney = budget * 0.9;

        }
        System.out.printf("%s - %s - %.2f", country, location, spentMoney);
    }
}
