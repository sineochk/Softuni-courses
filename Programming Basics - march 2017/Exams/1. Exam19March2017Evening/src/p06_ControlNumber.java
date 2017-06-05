import java.util.Scanner;

/**
 * Created by sineochk on 24.4.2017 г..
 * 18:45 - start
 * 19:20 - finish
 */
public class p06_ControlNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int m = Integer.parseInt(reader.nextLine());
        int controlNumber = Integer.parseInt(reader.nextLine());

        int sum= 0;
        int countMoves = 0;

        for (int firstNumber = 1; firstNumber <= n && sum < controlNumber; firstNumber++) {
            for (int secondNumber = m; secondNumber >= 1 && sum < controlNumber; secondNumber--) {
                sum+= (firstNumber*2) + (secondNumber*3);
                countMoves++;
            }
        }
        System.out.printf("%d moves",countMoves);
        if (sum >= controlNumber) {
            System.out.printf("\nScore: %d >= %d",sum,controlNumber);
        }
    }
}
