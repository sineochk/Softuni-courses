import java.util.Scanner;

/**
 * Created by sineochk on 4.4.2017 г..
 */
public class SquareFrame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        System.out.print("+ ");
        for (int j = 0; j < n-2; j++) {
                System.out.print("- ");
        }
        System.out.println("+");

        for (int i = 0; i < n-2 ; i++) {

            System.out.print("| ");
            for (int k = 0; k < n-2; k++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }

        System.out.print("+ ");
        for (int j = 0; j < n-2; j++) {
            System.out.print("- ");
        }
        System.out.println("+");
    }
}
