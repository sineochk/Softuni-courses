import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 1;
        do {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(reader.nextLine());
                if(n%2 !=0) {
                    System.out.println("The number is not even.");
                }
            } catch(NumberFormatException ex) {
                System.out.println("Invalid number!");
            }
        } while (n%2 !=0);
        System.out.println("Even number entered: "+n);
    }
}
