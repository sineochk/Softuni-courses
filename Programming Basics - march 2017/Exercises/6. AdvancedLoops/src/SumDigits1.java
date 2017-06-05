import java.util.Scanner;

/**
 * Created by 000 on 20.4.2017 г..
 */
public class SumDigits1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        // String value = String.valueOf(n);
        // System.out.println(value);
        int length = String.valueOf(n).length();
        // System.out.println(length);

        for (int i = 0; i <length ; i++) {
             sum += n%10;
            n /=10;
        }
        System.out.println(sum);
    }
}
