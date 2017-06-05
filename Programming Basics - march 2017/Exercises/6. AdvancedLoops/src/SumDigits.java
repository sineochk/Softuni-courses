import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class SumDigits {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        do {
            sum = sum + (n%10); //n= 14, sum = 4; n = 1, sum = 4 + 1
            n= n/10;            //n = 1;          n = 0;
        }while (n>0);
        System.out.println(sum);
    }
}
