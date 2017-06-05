import java.util.Scanner;

/**
 * Created by 000 on 12.3.2017 г..
 */
public class Classroom {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double h = Double.parseDouble(reader.nextLine());
        double w = Double.parseDouble(reader.nextLine());
        double rows = (int) (h * 100 / 120.0);
        double cols = (int)((w * 100) / 70 - 1) ;
        double seats = rows * cols - 3;
        System.out.printf("%.0f", seats);

    }
}
