import java.util.Scanner;

/**
 * Created by sineochk on 24.4.2017 г..
 * 16:13 - start
 * 16:37 - finish
 */
public class p01_GrapeAndRakia {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double landMeters = Double.parseDouble(reader.nextLine());
        double grapesKgForOneMeter = Double.parseDouble(reader.nextLine());
        double wastage = Double.parseDouble(reader.nextLine());

        double totalGrapesKg = landMeters* grapesKgForOneMeter;
        double forSale = totalGrapesKg - wastage;

        double grapesForRakia = forSale * 0.45;
        double grapesForSale = forSale * 0.55;

        double rakiaForSaleInLitters = grapesForRakia / 7.5;
        double incomeFromGrapes = grapesForSale * 1.5;
        double incomeFromRakia = rakiaForSaleInLitters * 9.8;

        System.out.printf("%.2f\n",incomeFromRakia);
        System.out.printf("%.2f",incomeFromGrapes);
        
    }
}
