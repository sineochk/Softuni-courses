import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p02_ExcellentOrNot {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        double a = Double.parseDouble(reader.nextLine());
        if (a >= 5.5){
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
