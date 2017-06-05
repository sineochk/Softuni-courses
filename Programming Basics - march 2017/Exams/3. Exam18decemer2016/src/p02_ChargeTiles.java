import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start: 12:45 - 12:55
 */
public class p02_ChargeTiles {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double money = Double.parseDouble(reader.nextLine());
        double floorWidth = Double.parseDouble(reader.nextLine());
        double floorLength = Double.parseDouble(reader.nextLine());
        double tileSide = Double.parseDouble(reader.nextLine());
        double tileHeight = Double.parseDouble(reader.nextLine());
        double tilePrise = Double.parseDouble(reader.nextLine());
        double fee = Double.parseDouble(reader.nextLine());

        double floorArea = floorWidth*floorLength;
        double tileArea = (tileSide * tileHeight) /2.0;
        double neededTiles = Math.ceil(floorArea / tileArea) + 5;
        double totalNeededMoney = (neededTiles * tilePrise) + fee;

        if (money >= totalNeededMoney) {
            System.out.printf("%.2f lv left.", money - totalNeededMoney);

        } else {
            System.out.printf("You'll need %.2f lv more.", totalNeededMoney - money);
        }

    }
}
