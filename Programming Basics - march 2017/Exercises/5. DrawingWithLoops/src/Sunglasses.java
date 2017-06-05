import java.util.Scanner;

/**
 * Created by 000 on 4.4.2017 г..
 */

        /*  Решение:
            1.              2n(*),               n( ),  2n(*)
            2. for(n-2) ->  1(*), 2n-2(/),1(*),  n(|),  1(*),2n-2(/),1(*)
            3.              2n(*),               n( ),  2n(*)
         */
public class Sunglasses {
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
                // n=2 -> (3+1)/2-1 = 4/2 -1 = 2-1 = 1 =>> ще се изпринтира на 2ри ред
                // n=2 -> (4+1)/2-1 = 5/2 -1 = 2-1 = 1 =>> ще се изпринтира на 2ри ред
                // n=2 -> (5+1)/2-1 = 6/2 -1 = 3-1 = 2 =>> ще се изпринтира на 3ти ред и т.н.
                if (i == (n+1)/2 -1) {
                    System.out.printf("*%s*%s*%s*"+System.getProperty("line.separator"),
                            repeatStr("/", 2*n-2),
                            repeatStr("|", n),
                            repeatStr("/", 2*n-2)
                    );
                } else {
                    System.out.printf("*%s*%s*%s*"+System.getProperty("line.separator"),
                            repeatStr("/", 2*n-2),
                            repeatStr(" ", n),
                            repeatStr("/", 2*n-2)
                    );
                }
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
