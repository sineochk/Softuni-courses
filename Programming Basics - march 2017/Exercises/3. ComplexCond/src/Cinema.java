import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class Cinema {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String type = reader.nextLine().toLowerCase();
        int rows = Integer.parseInt(reader.nextLine());
        int cols = Integer.parseInt(reader.nextLine());
        double result = rows * cols;
        if (type.equals("premiere")){
            System.out.printf("%.2f leva", result * 12.00);
         } else if (type.equals("normal")){
             System.out.printf("%.2f leva", result * 7.5);
         } else {
             System.out.printf("%.2f leva", result * 5.00);
         }
    }
}
