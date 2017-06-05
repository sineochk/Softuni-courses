import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        for (int i = 1; i < n ; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
