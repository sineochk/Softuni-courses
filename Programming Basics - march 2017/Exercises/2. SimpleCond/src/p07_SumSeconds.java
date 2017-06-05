import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int player1 = Integer.parseInt(reader.nextLine());
        int player2 = Integer.parseInt(reader.nextLine());
        int player3 = Integer.parseInt(reader.nextLine());
        int total = player1+player2+player3;
        int totalMinutes = total / 60;
        int totalSec = total % 60;

        if (totalSec < 10){
            System.out.printf("%d:0%d",totalMinutes, totalSec);
        } else {
            System.out.printf("%d:%d",totalMinutes, totalSec);
        }
    }
}
