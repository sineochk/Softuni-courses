import java.util.Scanner;

/**
 * Created by 000 on 7.4.2017 г..
 */
public class Diamond1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        if(n<3) {
            System.out.printf("%s"+System.getProperty("line.separator"),
                    Diamond1.RepeatStr("*",n)
            );
            return;
        }

        int rows = (int) Math.ceil((n-4)/2.0);
        int innerDashes = n%2==0?2:1;
        int outerDashes = (n - innerDashes - 2) / 2;

        System.out.printf("%s%s%s" + System.getProperty("line.separator"),
                Diamond1.RepeatStr("-", (n-1)/2),
                Diamond1.RepeatStr("*", n%2==0?2:1),
                Diamond1.RepeatStr("-", (n-1)/2)
        );

        for(int row = 0; row<rows; row++, innerDashes=innerDashes+2, outerDashes--) {
            System.out.printf("%s*%s*%s"+System.getProperty("line.separator"),
                    Diamond1.RepeatStr("-",outerDashes),
                    Diamond1.RepeatStr("-",innerDashes),
                    Diamond1.RepeatStr("-",outerDashes)
            );
        }

        System.out.printf("*%s*" + System.getProperty("line.separator"),
                Diamond1.RepeatStr("-", n-2)
        );

        innerDashes=innerDashes-2;
        outerDashes++;
        for(int row = 0; row<rows; row++, innerDashes=innerDashes-2, outerDashes++) {
            System.out.printf("%s*%s*%s"+System.getProperty("line.separator"),
                    Diamond1.RepeatStr("-",outerDashes),
                    Diamond1.RepeatStr("-",innerDashes),
                    Diamond1.RepeatStr("-",outerDashes)
            );
        }

        System.out.printf("%s%s%s" + System.getProperty("line.separator"),
                Diamond1.RepeatStr("-", (n-1)/2),
                Diamond1.RepeatStr("*", n%2==0?2:1),
                Diamond1.RepeatStr("-", (n-1)/2)
        );

    }

    static String RepeatStr(String strRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strRepeat;
        }
        return text;

    }

}
