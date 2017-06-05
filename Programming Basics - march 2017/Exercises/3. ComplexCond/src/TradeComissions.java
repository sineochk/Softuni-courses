import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class TradeComissions {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String city = reader.nextLine().toLowerCase();
        double sells = Double.parseDouble(reader.nextLine());
        if (sells >= 0) {
            switch (city) {
                case "sofia":
                    if (sells <= 500){
                        System.out.printf("%.2f ",sells * 0.05);
                    }else if (sells > 500 && sells <= 1000){
                        System.out.printf("%.2f ",sells * 0.07);
                    }else if (sells > 11 && sells <= 10000){
                        System.out.printf("%.2f ",sells * 0.08);
                    }else {
                        System.out.printf("%.2f ",sells * 0.12);
                    }
                    break;
                case "varna":
                    if (sells <= 500){
                        System.out.printf("%.2f ",sells * 0.045);
                    }else if (sells > 500 && sells <= 1000){
                        System.out.printf("%.2f ",sells * 0.075);
                    }else if (sells > 11 && sells <= 10000){
                        System.out.printf("%.2f ",sells * 0.1);
                    }else {
                        System.out.printf("%.2f ",sells * 0.13);
                    }
                    break;
                case "plovdiv":
                    if (sells <= 500){
                        System.out.printf("%.2f ",sells * 0.055);
                    }else if (sells > 500 && sells <= 1000){
                        System.out.printf("%.2f ",sells * 0.08);
                    }else if (sells > 11 && sells <= 10000){
                        System.out.printf("%.2f ",sells * 0.12);
                    }else {
                        System.out.printf("%.2f ",sells * 0.145);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
