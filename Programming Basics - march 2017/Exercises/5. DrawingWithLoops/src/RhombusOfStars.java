import java.util.Scanner;

/**
 * Created by 000 on 4.4.2017 г..
 */
public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for (int row = 0; row < n ; row++) {
            System.out.printf("%s%s"+System.getProperty("line.separator"),
                    RhombusOfStars.repeatStr(" ", n-1-row),
                    repeatStr("* ", row+1)
            );
        }
        for (int row = n-1; row > 0; row--) {
            System.out.printf("%s%s"+System.getProperty("line.separator"),
                    RhombusOfStars.repeatStr(" ", n-row),
                    repeatStr("* ", row)
            );
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
