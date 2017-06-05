
import java.util.Scanner;

/**
 * Created by 000 on 7.5.2017 г..
 */
public class p04_Football {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int stadium = Integer.parseInt(reader.nextLine());
        int fans = Integer.parseInt(reader.nextLine());

        int groupA = 0;
        int groupB = 0;
        int groupV = 0;
        int groupG = 0;

        for (int i = 0; i <fans ; i++) {
            String currentGroup = reader.nextLine();
            if (currentGroup.equals("A")) {
                groupA++;
            } else if (currentGroup.equals("B")) {
                groupB++;
            }else if (currentGroup.equals("V")) {
                groupV++;
            } else {
                groupG++;
            }
        }

        System.out.printf("%.2f%%\n", (double)groupA / fans * 100);
        System.out.printf("%.2f%%\n", (double)groupB / fans * 100);
        System.out.printf("%.2f%%\n", (double)groupV / fans * 100);
        System.out.printf("%.2f%%\n", (double)groupG / fans * 100);
        System.out.printf("%.2f%%\n", (double)fans / stadium * 100);
    }

}
