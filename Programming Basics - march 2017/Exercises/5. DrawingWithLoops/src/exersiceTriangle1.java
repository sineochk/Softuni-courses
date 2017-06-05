import java.util.Scanner;

/**
 * Created by 000 on 4.4.2017 г..
 */
public class exersiceTriangle1 {
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
            System.out.println();
        }
    }
}
