import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double inches = Double.parseDouble(reader.nextLine());
        double toCentimeters = inches* 2.54;
        System.out.println(toCentimeters);
    }

}
