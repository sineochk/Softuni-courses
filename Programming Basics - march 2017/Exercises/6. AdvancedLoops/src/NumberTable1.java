import java.util.Scanner;

/**
 * Created by 000 on 20.4.2017 г..
 */
public class NumberTable1 {
    public static void main(String[] args) {
        NumberTable2 table = new NumberTable2();
        table.test();
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for (int row = 0; row < n ; row++) {
            for (int col = 1; col <= n ; col++) {
                int num = row + col;
                if (num > n) {
                    num = n*2 - num; // n=5, num 6 => num = 10-6
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
