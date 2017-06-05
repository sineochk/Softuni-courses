import java.util.Scanner;

/**
 * Created by 000 on 6.4.2017 г..
 */
public class RhombusOfStars3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for (int row = 0; row < n ; row++) {
            System.out.printf("%s%s%s",
                    RhombusOfStars.repeatStr("@", n-1-row),
                    repeatStr(". ", row+1),
                    RhombusOfStars.repeatStr("@", n-2-row)
            );
            System.out.printf("%s%s%s"+System.getProperty("line.separator"),
                    RhombusOfStars.repeatStr("@", n-row==1?0:n-row),
                    repeatStr(". ", row+1),
                    RhombusOfStars.repeatStr("@", n-1-row)
            );
        }
        for (int row = n-1; row > 0; row--) {
            System.out.printf("%s%s%s",
                    RhombusOfStars.repeatStr("@", n-row),
                    repeatStr(". ", row),
                    RhombusOfStars.repeatStr("@", n-row-1)
            );
            System.out.printf("%s%s%s"+System.getProperty("line.separator"),
                    RhombusOfStars.repeatStr("@", n-row+1),
                    repeatStr(". ", row),
                    RhombusOfStars.repeatStr("@", n-row)
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
