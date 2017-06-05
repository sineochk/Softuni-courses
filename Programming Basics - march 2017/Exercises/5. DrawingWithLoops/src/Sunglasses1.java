import java.util.Scanner;

/**
 * Created by sineochk on 7.4.2017 г..
 */
public class Sunglasses1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                System.out.printf("%s%s%s"+System.getProperty("line.separator"),
                        repeatStr("*", 2*n),
                        repeatStr(" ", n),
                        repeatStr("*", 2*n)
                );
            } else {
                System.out.printf("*%s*%s*%s*"+System.getProperty("line.separator"),
                        repeatStr("/", 2*n-2),
                        repeatStr(i == Math.ceil(n/2.0)-1 ? "|" : " ", n),
                        repeatStr("/", 2*n-2)
                );
            }
        }
    }
    static String repeatStr (String strRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text + strRepeat;
        }
        return text;
    }
}
