import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x1 = Double.parseDouble(reader.nextLine());
        double y1 = Double.parseDouble(reader.nextLine());
        double x2 = Double.parseDouble(reader.nextLine());
        double y2 = Double.parseDouble(reader.nextLine());

        double area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
        double perimeter = 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
        System.out.println(area);
        System.out.println(perimeter);
    }
}
