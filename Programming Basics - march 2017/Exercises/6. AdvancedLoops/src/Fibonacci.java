import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int f = 1;
        int fNext = 1;
        int temp;

        if(n==1 && n==0) {
            System.out.println("1");
        }
        for (int i = 2; i <= n ; i++) {
            temp = f + fNext;
            f = fNext;
            fNext = temp;
        }
        System.out.println(fNext);
    }
}
