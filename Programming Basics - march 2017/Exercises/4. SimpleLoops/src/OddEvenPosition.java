import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by 000 on 30.3.2017 г..
 */
public class OddEvenPosition {
    public static void main(String[] args) {

        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(new Locale("EN"));
        decimalFormatSymbols.setDecimalSeparator('.');

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        if(n==1 || n==0) {
            if(n==1) {
                double num = Double.parseDouble(reader.nextLine());
                System.out.printf("OddSum=%s\n", decimalFormat.format(num));
                System.out.printf("OddMin=%s\n", decimalFormat.format(num));
                System.out.printf("OddMax=%s\n", decimalFormat.format(num));
            } else {
                System.out.printf("OddSum=%s\n", "0");
                System.out.printf("OddMin=%s\n", "No");
                System.out.printf("OddMax=%s\n", "No");
            }
            System.out.printf("EvenSum=%s\n", "0");
            System.out.printf("EvenMin=%s\n", "No");
            System.out.printf("EvenMax=%s", "No");
            return;
        }

        double oddSum = 0;
        double oddMin = 0;
        double oddMax = 0;

        double evenSum = 0;
        double evenMin = 0;
        double evenMax = 0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(reader.nextLine());
            if (i % 2 == 1){
               if (num < oddMin || i == 1){
                   oddMin = num;
               }
               if (num > oddMax || i == 1) {
                   oddMax = num;
               }
               oddSum += num;
            } else if (i % 2 == 0){
                if (num < evenMin || i == 2){
                    evenMin = num;
                }
                if (num > evenMax || i == 2) {
                    evenMax = num;
                }
                evenSum += num;
            }
        }
        System.out.printf("OddSum=%s\n", decimalFormat.format(oddSum));
        System.out.printf("OddMin=%s\n", decimalFormat.format(oddMin));
        System.out.printf("OddMax=%s\n", decimalFormat.format(oddMax));
        System.out.printf("EvenSum=%s\n", decimalFormat.format(evenSum));
        System.out.printf("EvenMin=%s\n", decimalFormat.format(evenMin));
        System.out.printf("EvenMax=%s", decimalFormat.format(evenMax));

    }

}
