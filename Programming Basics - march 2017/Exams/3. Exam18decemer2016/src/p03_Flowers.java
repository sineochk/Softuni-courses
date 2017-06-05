import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start:13:10
 * finish: 13:45
 */
public class p03_Flowers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int chrysanthemum = Integer.parseInt(reader.nextLine());
        int rose = Integer.parseInt(reader.nextLine());
        int tulip = Integer.parseInt(reader.nextLine());
        String season = reader.nextLine();
        String isHoliday = reader.nextLine();

        int totalFlowers = chrysanthemum + rose + tulip;
        double totalAmount = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            totalAmount = (2*chrysanthemum) + (4.1*rose) + (2.5* tulip);
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            totalAmount = (3.75*chrysanthemum) + (4.5*rose) + (4.15* tulip);
        }

        if (isHoliday.equals("Y")) {
            totalAmount *=1.15;
        }
        if (season.equals("Spring") && tulip > 7 ) {
            totalAmount *= 0.95;
        }
        if (season.equals("Winter") && rose >= 10) {
            totalAmount *=0.9;
        }
        if(totalFlowers > 20){
            totalAmount *=0.80;
        }
        System.out.printf("%.2f", totalAmount + 2);
    }

}

