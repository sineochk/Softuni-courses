import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class FruitShop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String fruit = reader.nextLine().toLowerCase();
        String day = reader.nextLine().toLowerCase();
        double quantity = Double.parseDouble(reader.nextLine());
        boolean workDays = day.equals("monday") || day.equals("tuesday") ||
                day.equals("wednesday") || day.equals("thursday") || day.equals("friday");
        boolean holidays = day.equals("saturday") || day.equals("sunday");
        if (workDays){
            switch (fruit) {
                case "banana": System.out.printf("%f",quantity * 2.5);
                    break;
                case "apple": System.out.printf("%f",quantity * 1.2);
                    break;
                case "orange": System.out.printf("%f",quantity * 0.85);
                    break;
                case "grapefruit": System.out.printf("%f",quantity * 1.45);
                    break;
                case "kiwi": System.out.printf("%f",quantity * 2.7);
                    break;
                case "pineapple": System.out.printf("%f",quantity * 5.5);
                    break;
                case "grapes": System.out.printf("%f",quantity * 3.85);
                    break;
                default: System.out.println("error");
            }
        } else if (holidays){
            switch (fruit) {
                case "banana": System.out.printf("%f",quantity * 2.7);
                    break;
                case "apple": System.out.printf("%f",quantity * 1.25);
                    break;
                case "orange": System.out.printf("%f",quantity * 0.90);
                    break;
                case "grapefruit": System.out.printf("%f",quantity * 1.60);
                    break;
                case "kiwi": System.out.printf("%f",quantity * 3.0);
                    break;
                case "pineapple": System.out.printf("%f",quantity * 5.6);
                    break;
                case "grapes": System.out.printf("%f",quantity * 4.2);
                    break;
                default: System.out.println("error");
            }
        } else{
            System.out.println("error");
        }
    }
}
