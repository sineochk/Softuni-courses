import java.util.Scanner;

/**
 * Created by sineock on 1.5.2017 г..
 * start: 12:20
 * finish: 12:40
 */

public class p01_Distance {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstSpeed = Integer.parseInt(reader.nextLine());
        double firstTimeInMinutes = Double.parseDouble(reader.nextLine());
        double secondTimeInMinutes = Double.parseDouble(reader.nextLine());
        double thirdTimeInMinutes = Double.parseDouble(reader.nextLine());

        double secondSpeed = firstSpeed*1.1;
        double thirdSpead = secondSpeed - secondSpeed*0.05;

        double totalKm = (firstSpeed * firstTimeInMinutes/60) + (secondSpeed * secondTimeInMinutes/60) + (thirdSpead* thirdTimeInMinutes/60);
        System.out.printf("%.2f",totalKm);

    }
}
