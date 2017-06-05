import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class Volleyball {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String isLeap = reader.nextLine();
        double holidays = Double.parseDouble(reader.nextLine());
        int traveling = Integer.parseInt(reader.nextLine());
        double totalWeekends = 48;

        double gamesInSofia = (totalWeekends - traveling) * 3/4;
        double holidaysGames = holidays * 2/3;
        double totalGames = traveling + gamesInSofia + holidaysGames;

        System.out.printf("%.0f",Math.floor(totalGames * (isLeap.equals("leap")?1.15:1) ));

    }
}
