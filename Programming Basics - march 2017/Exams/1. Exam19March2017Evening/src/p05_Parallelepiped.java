import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

/**
 * Created by sineochk on 24.4.2017 г..
 * 18:15 - start
 * 18:35 - finish
 */

public class p05_Parallelepiped {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        System.out.printf("+%s+%s"+System.getProperty("line.separator"),
                stringRepeat("~", n-2),
                stringRepeat(".", n*2+1)
        );

        for (int i = 0; i <= n*2; i++) {
            System.out.print("|");
            System.out.printf("%s\\%s\\%s"+System.getProperty("line.separator"),
                    stringRepeat(".", i),
                    stringRepeat("~", n-2),
                    stringRepeat(".", n*2-i)
            );
        }
        for (int i = 0; i <= n*2; i++) {

            System.out.printf("%s\\%s|%s|"+System.getProperty("line.separator"),
                    stringRepeat(".", i),
                    stringRepeat(".", n*2-i),
                    stringRepeat("~", n-2)
            );
        }
        System.out.printf("%s+%s+"+System.getProperty("line.separator"),
                stringRepeat(".", n*2+1),
                stringRepeat("~", n-2)

        );


    }
    static String stringRepeat (String repeatStr, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text+ repeatStr;
        }
        return text;
    }
}
