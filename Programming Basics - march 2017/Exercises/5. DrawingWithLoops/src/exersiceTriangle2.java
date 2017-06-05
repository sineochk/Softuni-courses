import java.util.Scanner;

/**
 * Created by 000 on 4.4.2017 г..
 */
public class exersiceTriangle2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (i%2 != 0) {
                    System.out.print("$");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\\");

            for (int j = 0; j < 2 ; j++) {
                for (int k = 1; k <= n- i; k++) {
                    if (i%2 != 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.print("/");

            for (int j = 1; j <= i; j++) {
                if (i%2 != 0) {
                    System.out.print("$");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
