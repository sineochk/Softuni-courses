import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start: 13:30 - 13:55
 */
public class P01_HousePainting { public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    double x = Double.parseDouble(reader.nextLine());
    double y = Double.parseDouble(reader.nextLine());
    double roofHeight = Double.parseDouble(reader.nextLine());

    double greenPaintPerLitter = 3.4;
    double redPaintPerLitter = 4.3;
    double backWall = x*x;
    double frontWall = backWall - (1.2*2);
    double sideWalls = ((x*y)*2) - ((1.5 * 1.5)*2);
    double greenPaint = (backWall + frontWall + sideWalls) / greenPaintPerLitter;

    double roofWalls = (x*y)*2;
    double roof = roofWalls + (x*roofHeight/2) * 2;
    double redPaint = roof / redPaintPerLitter;

    System.out.printf("%.2f\n%.2f", greenPaint, redPaint);
}
}
