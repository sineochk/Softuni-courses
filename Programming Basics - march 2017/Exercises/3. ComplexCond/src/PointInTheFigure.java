import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 *       1. дали е в първи правоъгълник
 *       2. дали е във втори правоъгълник
 *       3. дали е между двата
 *       4. дали е на бордър
 *       5. дали е извън правоъгълниците
 */

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int height = Integer.parseInt(reader.nextLine());
        int x = Integer.parseInt(reader.nextLine());
        int y = Integer.parseInt(reader.nextLine());
        int firstRectanglex1 = 0;
        int firstRectangley1 = 0; //0,0

        int firstRectanglex2= 3 * height;
        int firstRectangley2 = height; //2,6

        int secondRectanglex1 = height;
        int secondRectangley1 = height; //1,1

        int secondRectanglex2= 2 * height ;
        int secondRectangley2 = 4 * height; //2,6

        boolean isInsideFirstRectangle =
                (((x>firstRectanglex1) && (x<firstRectanglex2)) && ((y>firstRectangley1) && (y<firstRectangley2)) );
        boolean isInsideSecondRectangle =
                (((x>secondRectanglex1) && (x<secondRectanglex2)) && ((y>secondRectangley1) && (y<secondRectangley2)) );
        boolean isBetweenRectangles = ((x>secondRectanglex1) && (x<secondRectanglex1 + height)) && ((y==secondRectanglex1));

        boolean firstRectIsOnBorderX = ((y==firstRectangley1) || (y==firstRectangley2)) &&
                (x>=firstRectanglex1 && x<=firstRectanglex2);
        boolean firstRectIsOnBorderY = (((x==firstRectanglex1) || (x==firstRectanglex2)) &&
                (y>=firstRectangley1 && y<=firstRectangley2));
        boolean isOnBorderFirstRect = (firstRectIsOnBorderX || firstRectIsOnBorderY ) && !isBetweenRectangles;

        boolean secondRectIsOnBorderX = ((y==secondRectangley1) || (y==secondRectangley2)) &&
                (x>=secondRectanglex1 && x<=secondRectanglex2);
        boolean secondRectIsOnBorderY = (((x==secondRectanglex1) || (x==secondRectanglex2)) &&
                (y>=secondRectangley1 && y<=secondRectangley2));
        boolean isOnBorderSecondRect = (secondRectIsOnBorderX || secondRectIsOnBorderY ) && !isBetweenRectangles;

        boolean onBorder = isOnBorderFirstRect || isOnBorderSecondRect;

        if (isInsideFirstRectangle || isInsideSecondRectangle || isBetweenRectangles ){
            System.out.println("inside");
        } else if(onBorder){
            System.out.println("border");
        } else{
            System.out.println("outside");
        }
    }
}

