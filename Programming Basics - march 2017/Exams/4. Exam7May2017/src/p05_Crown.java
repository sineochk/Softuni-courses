import java.util.Scanner;

/**
 * Created by 000 on 7.5.2017 г..
 */
public class p05_Crown {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int count = n-5;
        int count2 = 1;

        System.out.printf("@%s@%s@\n",
                stringRepeat(" ",n-2),
                stringRepeat(" ", n-2)
        );
        System.out.printf("**%s*%s**\n",
                stringRepeat(" ",n-3),
                stringRepeat(" ", n-3)
        );

        for (int i = 1; i < n/2  ; i++) {
            System.out.printf("*%s*%s%s%s%s%s*%s*\n",
                    stringRepeat(".",i),
                    stringRepeat(" ", count),
                    stringRepeat("*", i != n/2-1?1:0),
                    stringRepeat(".", count2),
                    stringRepeat("*", i != n/2-1?1:0),
                    stringRepeat(" ",  count),
                    stringRepeat(".", i)

            );
            count -=2;
            count2 +=2;
        }
        System.out.printf("*%s%s.%s%s*\n",
                stringRepeat(".",n/2),
                stringRepeat("*", n -(n/2 + 2)),
                stringRepeat("*", n -(n/2 + 2)),
                stringRepeat(".", n/2)
        );
        System.out.printf("%s\n",
                stringRepeat("*", 2*n-1)
        );
        System.out.printf("%s\n",
                stringRepeat("*", 2*n-1)
        );


    }
    public static String stringRepeat(String str , int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += str;
        }
        return text;
    }
}
