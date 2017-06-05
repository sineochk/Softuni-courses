import java.util.Scanner;

/**
 * Created by sineochk on 24.4.2017 г..
 * 17:15 - start
 * 17:35 - finish
 */
public class p03_TruckDriver {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String season = reader.nextLine();
        double kmForMonth = Double.parseDouble(reader.nextLine());

        double priseForSeason=0;

        if (kmForMonth > 0 && kmForMonth<= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                priseForSeason= 0.75;

            } else if (season.equals("Summer")) {
                priseForSeason= 0.9;
            } else if(season.equals("Winter")) {
                priseForSeason= 1.05;
            }
        } else if (kmForMonth <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                priseForSeason= 0.95;
            } else if (season.equals("Summer")) {
                priseForSeason= 1.1;
            } else if(season.equals("Winter")) {
                priseForSeason= 1.25;
            }
        } else {
            priseForSeason= 1.45;
        }
        double salary = kmForMonth * priseForSeason * 4.0;
        System.out.printf("%.2f", salary - (salary*0.1));

    }
}
