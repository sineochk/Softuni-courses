import java.util.Scanner;

/**
 * Created by 000 on 15.4.2017 г..
 */
public class NumberInRange1To100_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("enter a number in the range [1...100]:");
        int n = Integer.parseInt(reader.nextLine());
        while (!(n>= 1 && n<= 100)){
                System.out.println("Invalid number!");
                System.out.print("enter a number in the range [1...100]:");
                n = Integer.parseInt(reader.nextLine());
        }
        System.out.printf("The number is: %d", n);
    }
}
