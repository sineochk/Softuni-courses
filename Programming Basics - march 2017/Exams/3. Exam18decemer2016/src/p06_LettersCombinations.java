import java.util.Scanner;

/**
 * Created by 000 on 1.5.2017 г..
 */
public class p06_LettersCombinations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char symbolOne = reader.next().charAt(0);
        char symbolTwo = reader.next().charAt(0);
        char escSymbol = reader.next().charAt(0);
        int count = 0;

        for (int i = symbolOne; i <= symbolTwo ; i++) {
            if ((char)i == escSymbol) {
                continue;
            }
            for (int j = symbolOne; j <= symbolTwo; j++) {
                if ((char)j == escSymbol) {
                    continue;
                }
                for (int k = symbolOne; k <= symbolTwo; k++) {
                    if ((char)k == escSymbol) {
                        continue;
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
