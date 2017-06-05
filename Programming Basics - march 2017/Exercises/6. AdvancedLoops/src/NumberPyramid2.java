import java.util.Scanner;

/**
 * Created by 000 on 21.4.2017 г..
 */
public class NumberPyramid2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int num = 1;

        for (int row = 1; num <= n ; row++) {
            for (int col = 0; col < row && num <= n ; col++) {
                System.out.print(num + " ");
                num ++;
            }
            System.out.println();
        }
    }
}
