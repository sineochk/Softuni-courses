import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

/**
 * Created by 000 on 6.4.2017 г..
 *
 */


public class Heart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());


        // 1         [1]*[2n-1]*[1]
        // row<n-1   *[row+1]*[n-3+n-2row]*[row+1]*
        // 1         *[n]*[n]*
        // row<n     [row+1]*[(n2-1)-2*row]*[row+1]
        // 1         [n+1]*[n+1]

        System.out.printf(" *%s* "+System.getProperty("line.separator"),repeatStr(" ",(2*n)-1));
        for(int row = 0; row<n-1; row++) {
            System.out.printf("*%s*%s*%s*"+System.getProperty("line.separator"),
                    repeatStr(" ",row+1),
                    repeatStr(" ",(2*n-3)-(2*row)),
                    repeatStr(" ",row+1)
            );
        }
        System.out.printf("*%s*%s*"+System.getProperty("line.separator"),
                repeatStr(" ",n),
                repeatStr(" ",n)
        );
        for(int row = 0; row<n; row++) {
            System.out.printf("%s*%s*%s"+System.getProperty("line.separator"),
                    repeatStr(" ",row+1),
                    repeatStr(" ",(n*2)-1-(2*row)),
                    repeatStr(" ",row+1)
            );
        }
        System.out.printf("%s*%s"+System.getProperty("line.separator"),
                repeatStr(" ",n+1),
                repeatStr(" ",n+1)
        );
    }

    static String repeatStr(String strRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strRepeat;
        }
        return text;

    }
}
