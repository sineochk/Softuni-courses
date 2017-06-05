import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

/**
 * Created by 000 on 7.5.2017 г..
 */
public class p01_AlchoholMarket {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double whiskeyPricePerLiter = Double.parseDouble(reader.nextLine());
        Double beerLiters = Double.parseDouble(reader.nextLine());
        Double wineLiters = Double.parseDouble(reader.nextLine());
        Double rakiaLiters = Double.parseDouble(reader.nextLine());
        Double whiskeyLiters = Double.parseDouble(reader.nextLine());


        Double rakiaPricePerLiter = whiskeyPricePerLiter /2;
        Double rakiaPrice = (whiskeyPricePerLiter /2) * rakiaLiters ;
        Double winePrice = (rakiaPricePerLiter - (rakiaPricePerLiter * 0.4)) * wineLiters;
        Double beerPrice = (rakiaPricePerLiter- (rakiaPricePerLiter* 0.8)) * beerLiters;
        Double whiskeyPrice = whiskeyPricePerLiter * whiskeyLiters;

        Double total = winePrice + rakiaPrice + whiskeyPrice + beerPrice;
        System.out.printf("%.2f", total);
    }
}
