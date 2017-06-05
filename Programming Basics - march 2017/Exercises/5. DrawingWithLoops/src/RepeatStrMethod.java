import java.io.StringReader;

/**
 * Created by 000 on 4.4.2017 г..
 */
public class RepeatStrMethod {
    public static void main(String[] args) {

    }

    static String RepeatStr(String strRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strRepeat;
        }
        return text;

    }
}
