import java.util.Scanner;

/**
 * Created by 000 on 7.5.2017 г..
 */
public class p02_ToyShop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double neededMoney = Double.parseDouble(reader.nextLine());
        int toy1 = Integer.parseInt(reader.nextLine());
        int toy2 = Integer.parseInt(reader.nextLine());
        int toy3 = Integer.parseInt(reader.nextLine());
        int toy4 = Integer.parseInt(reader.nextLine());
        int toy5 = Integer.parseInt(reader.nextLine());



        Double toy1Price = toy1 * 2.60;
        Double toy2Price = toy2 * 3.0;
        Double toy3Price = toy3 * 4.1;
        Double toy4Price = toy4 * 8.2;
        Double toy5Price = toy5 * 2.0;

        int totalToys = toy1 + toy2 + toy3 + toy4 + toy5;
        Double totalPrice = toy1Price + toy2Price + toy3Price + toy4Price + toy5Price;

        if (totalToys >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }
        totalPrice = totalPrice - (totalPrice * 0.1);

        if (totalPrice >= neededMoney) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - neededMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney - totalPrice);
        }
    }
}
