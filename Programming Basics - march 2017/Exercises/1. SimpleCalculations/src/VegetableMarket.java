import java.util.Scanner;

/**
 * Created by 000 on 12.3.2017 г..
 */
public class VegetableMarket {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(reader.nextLine());
        double fruitPrice = Double.parseDouble(reader.nextLine());
        int vegetableKg = Integer.parseInt(reader.nextLine());
        int fruitKg = Integer.parseInt(reader.nextLine());
        System.out.println(((vegetablePrice*vegetableKg) + (fruitPrice* fruitKg)) / 1.94);
    }
}
