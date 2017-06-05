import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class NumberTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for (int row = 1; row <= n ; row++) {
            for (int i = row; i <= n ; i++) {
                System.out.print(i + " ");
            }
            for (int i = n-1; i > n-row ; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
