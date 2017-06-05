import java.util.Scanner;

/**
 * Created by 000 on 5.3.2017 г..
 */
public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double radians = Double.parseDouble(reader.nextLine());
        double toDegrees = Math.round(radians * 180 / Math.PI);
        System.out.println(toDegrees);
    }
}
