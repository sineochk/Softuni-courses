import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
//square, circle, triangle, rectangle
public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String figure = reader.nextLine();
        double area = 0;
        if (figure.equals("square")){
            double a = Double.parseDouble(reader.nextLine());
            area = a*a;
        }
        else if (figure.equals("rectangle")){
            double a = Double.parseDouble(reader.nextLine());
            double b = Double.parseDouble(reader.nextLine());
            area = a*b;
        }
        else if (figure.equals("circle")){
            double r = Double.parseDouble(reader.nextLine());
            area = Math.PI * r * r ;
        }
        else if (figure.equals("triangle")){
            double a = Double.parseDouble(reader.nextLine());
            double h = Double.parseDouble(reader.nextLine());
            area = (a*h)/2;
        }
        System.out.printf("%.3f",area);
    }
}
