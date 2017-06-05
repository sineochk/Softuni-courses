import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start: 17:45
 * finish 16:20
 *
 */
public class P06_TwoNumbersSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int biggerNum = Integer.parseInt(reader.nextLine());
        int smallerNum = Integer.parseInt(reader.nextLine());
        int magicNum = Integer.parseInt(reader.nextLine());
        int combinations = 0;
        int i = biggerNum;
        int j = biggerNum;
        boolean found = false;

        for (; i >= smallerNum && !found; i--) {
            for (j = biggerNum; j >= smallerNum && !found; j--) {
                combinations++;
                found = i+j == magicNum;
            }
        }
// увеличаваме, понеже for е тъп
        if(found) {
            System.out.printf("Combination N:%d (%d + %d = %d)\n", combinations, ++i, ++j, magicNum);

        } else {
            System.out.printf("%d combinations - neither equals %d\n", combinations, magicNum);
        }

    }
}
