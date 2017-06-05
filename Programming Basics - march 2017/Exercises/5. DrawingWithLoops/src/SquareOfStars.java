import java.util.Scanner;

/**
 * Created by 000 on 4.4.2017 г..
 */
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < n ; i++) {
            System.out.print(repeatStr("* ", n));
            System.out.println();
        }
    }
    static String repeatStr(String strRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strRepeat;
        }
        return text;
    }
}
