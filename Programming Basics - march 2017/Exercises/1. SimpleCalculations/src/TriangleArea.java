import java.util.Scanner;


public class TriangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double a = Double.parseDouble(reader.nextLine());
        double h = Double.parseDouble(reader.nextLine());
        double area= a * h /2;
        System.out.printf("%.2f",area);
    }

}
