import java.util.Scanner;


public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double b1 = Double.parseDouble(reader.nextLine());
        double b2 = Double.parseDouble(reader.nextLine());
        double h = Double.parseDouble(reader.nextLine());
        double area = (b1 + b2) * h /2;
        System.out.print(area);
    }

}
