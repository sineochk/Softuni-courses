import java.util.Scanner;

/**
 * Created by sineochk on 4.4.2017 г..
 */
public class RectangleNxNStars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < n ; i++) {
            System.out.printf("%s\n", RepeatStr("*", n));
        }
    }

    static String RepeatStr(String strRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strRepeat;
        }
        return text;
    }
}
