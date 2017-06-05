import java.util.Scanner;

/**
 * Created by 000 on 5.3.2017 г..
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double celsius = Double.parseDouble(reader.nextLine());
        double toFahrenheit = (celsius * 9/5) + 32;
        System.out.println(toFahrenheit);
    }


}
