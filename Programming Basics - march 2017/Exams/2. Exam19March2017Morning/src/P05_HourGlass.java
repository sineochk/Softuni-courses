import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * 1 row - 2n+ 1 (*)
 * 2 row - for(0 -> 5) (.), (*), (2n+1) - 4 ( ), (*), for(0 -> 5)
 * finish : 16:45 - 15:42
 */
public class P05_HourGlass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        System.out.printf("%s\n", repeatStr("*", 2*n+1));
        for (int row = -1; row <= n-2 ; row++) {
            System.out.printf("%s*%s%s%s\n",
                    repeatStr(".", row + 2),
                    repeatStr(row == -1 ? " " : "@", (2*n-5) - row*2),
                    repeatStr("*", row == n-2 ? 0 : 1),
                    repeatStr(".", row + 2)
            );
        }
        for (int row = 0; row <= n-2 ; row++) {
            System.out.printf("%s*%s@%s*%s\n",
                    repeatStr(".", n-1 - row),
                    repeatStr(row == n-2 ? "@" : " ", row ),
                    repeatStr(row == n-2 ? "@" : " ", row ),
                    repeatStr(".", n-1 - row)
            );
        }
        System.out.printf("%s", repeatStr("*", 2*n+1));
    }

    public static String repeatStr(String strRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text+=strRepeat;
        }
        return text;
    }
}
