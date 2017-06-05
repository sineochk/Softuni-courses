import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
// -11 prime, 0- not prime , 1- not prime
public class CheckPrime {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        boolean isPrime = true;

        if (n<=1) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(n) && isPrime; i++) {
            if (n%i ==0){
                isPrime = false;
            }
        }
        String result = isPrime ? "Prime" : "Not prime";
            System.out.println(result);
    }
}
