import java.util.Scanner;

/**
 * Created by 000 on 4.4.2017 г..
 */
public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
