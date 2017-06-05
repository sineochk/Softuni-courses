import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x1 =Double.parseDouble(reader.nextLine());
        double y1 =Double.parseDouble(reader.nextLine());
        double x2 =Double.parseDouble(reader.nextLine());
        double y2 =Double.parseDouble(reader.nextLine());
        double x = Double.parseDouble(reader.nextLine());
        double y = Double.parseDouble(reader.nextLine());
        boolean onBorderX = ((x==x1) || (x==x2)) && (y>=y1 && y<=y2);
        boolean onBorderY = ((y==y1) || (y==y2)) && (x>=x1 && x<=x2);
        if (onBorderX || onBorderY){
            System.out.println("Border");
        } else  {
            System.out.println("Inside / Outside");
        }
    }
}
