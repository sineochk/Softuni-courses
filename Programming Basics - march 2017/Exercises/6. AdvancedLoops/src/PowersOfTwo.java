import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int result = 2;
        System.out.println("1");
        for (int i = 1; i <=n ; i++) {
            System.out.println(result);
            result*=2;
        }
    }
}
