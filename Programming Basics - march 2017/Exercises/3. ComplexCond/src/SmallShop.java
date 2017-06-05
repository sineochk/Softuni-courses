import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class SmallShop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String item = reader.nextLine().toLowerCase();
        String city = reader.nextLine().toLowerCase();
        double quantity = Double.parseDouble(reader.nextLine());

        if (city.equals("sofia")){
            if (item.equals("coffee")){
                System.out.printf("%f", quantity * 0.5);
            } else if (item.equals("water")){
                System.out.printf("%f", quantity * 0.8);
            } else if (item.equals("beer")){
                System.out.printf("%f", quantity * 1.2);
            } else if (item.equals("sweets")){
                System.out.printf("%f", quantity * 1.45);
            } else if (item.equals("peanuts")){
                System.out.printf("%f", quantity * 1.6);
            }

        } else if (city.equals("plovdiv")) {
            if (item.equals("coffee")) {
                System.out.printf("%f", quantity * 0.4);
            } else if (item.equals("water")) {
                System.out.printf("%f", quantity * 0.7);
            } else if (item.equals("beer")) {
                System.out.printf("%f", quantity * 1.15);
            } else if (item.equals("sweets")) {
                System.out.printf("%f", quantity * 1.3);
            } else if (item.equals("peanuts")) {
                System.out.printf("%f", quantity * 1.5);
            }
        } else if (city.equals("varna")){
            if (item.equals("coffee")) {
                System.out.printf("%f", quantity * 0.45);
            } else if (item.equals("water")) {
                System.out.printf("%f", quantity * 0.7);
            } else if (item.equals("beer")) {
                System.out.printf("%f", quantity * 1.1);
            } else if (item.equals("sweets")) {
                System.out.printf("%f", quantity * 1.35);
            } else if (item.equals("peanuts")) {
                System.out.printf("%f", quantity * 1.55);
            }
        }
        }
    }

