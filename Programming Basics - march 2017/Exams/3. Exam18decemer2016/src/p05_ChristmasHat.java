import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 */
public class p05_ChristmasHat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        System.out.printf("%s/|\\%s\n",
                stringRepeat(".", 2* num - 1),
                stringRepeat(".", 2* num - 1)
                );
        System.out.printf("%s\\|/%s\n",
                stringRepeat(".", 2* num - 1),
                stringRepeat(".", 2* num - 1)
        );
        for (int i = 2*num - 1; i >= 0 ; i--) {
            System.out.printf("%s*%s*%s*%s\n",
                    stringRepeat(".", i),
                    stringRepeat("-", 2* num - (i+1)),
                    stringRepeat("-", 2* num - (i+1)),
                    stringRepeat(".", i)
            );
        }
        System.out.printf("%s\n", stringRepeat("*", 4* num +1));
        System.out.printf("%s*%s\n",
                stringRepeat("*.", num),
                stringRepeat(".*", num)
        );
        System.out.printf("%s", stringRepeat("*", 4* num +1));
    }

    public static String stringRepeat(String str , int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += str;
        }
        return text;
    }
}
