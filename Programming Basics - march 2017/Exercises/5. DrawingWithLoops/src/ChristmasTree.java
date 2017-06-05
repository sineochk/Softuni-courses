import java.util.Scanner;

/**
 * Created by sineochk on 4.4.2017 г..
 */
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        System.out.printf("%s", repeatStr(" ", n));
        System.out.println(" | ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s%s | %s"+System.getProperty("line.separator"),
                    repeatStr(" ", n-i),
                    repeatStr("*", i),
                    repeatStr("*", i)
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
