import java.util.Scanner;

/**
 * Created by 000 on 5.5.2017 г..
 */
public class p06_LettersCombinations_v3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char symbolOne = reader.next().charAt(0);
        char symbolTwo = reader.next().charAt(0);
        char escSymbol = reader.next().charAt(0);
        int count = 0;

        for (int i = symbolOne; i <= symbolTwo; i+=(char)(i+1)==escSymbol?2:1) {
            for (int j = symbolOne; j <= symbolTwo ; j+=(char)(j+1)==escSymbol?2:1) {
                for (int k = symbolOne; k <= symbolTwo; k+=(char)(k+1)==escSymbol?2:1){
                    count++;
                    System.out.print((char)i + "" + (char)j + "" + (char)k + " ");
                }
            }
        }
        System.out.println(count);
    }
}
