import java.util.Scanner;


public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double r = Double.parseDouble(reader.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
