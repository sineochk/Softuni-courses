import java.util.Scanner;

/**
 * Created by sineochk on 24.4.2017 г..
 * 16:45 - start
 * 17:05 - finish
 */
public class p02_Styrofoam {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double budget = Double.parseDouble(reader.nextLine());
        double houseArea = Double.parseDouble(reader.nextLine());
        int windows = Integer.parseInt(reader.nextLine());
        double styrofoamMetters = Double.parseDouble(reader.nextLine());
        double styrofoamPackLv = Double.parseDouble(reader.nextLine());

        double houseAreaForEdit = (houseArea - ((double)windows*2.4)) *1.10;
        double neededStyrofoamPacks = Math.ceil(houseAreaForEdit / styrofoamMetters);
        double totalStyrofoamLv = neededStyrofoamPacks * styrofoamPackLv;

        if (totalStyrofoamLv < budget) {
            System.out.printf("Spent: %.2f\n",totalStyrofoamLv);
            System.out.printf("Left: %.2f",budget- totalStyrofoamLv);

        } else {
            System.out.printf("Need more: %.2f ", totalStyrofoamLv - budget );
        }

    }
}
