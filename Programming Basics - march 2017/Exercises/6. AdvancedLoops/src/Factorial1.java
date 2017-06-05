import java.util.Scanner;

/**
 * Created by 000 on 20.4.2017 г..
 */
public class Factorial1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        do {
            factorial*= n;
            n--;
        }while(n>0);
        System.out.println(factorial);
    }
}
