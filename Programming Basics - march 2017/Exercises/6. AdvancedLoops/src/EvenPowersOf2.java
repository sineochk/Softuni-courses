import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int result = 2;
        System.out.println("1");
        for (int i = 1; i <=n ; i++) {
            if (i%2==0) {
                System.out.println(result);
            }
            result*=2;
        }
    }
}
