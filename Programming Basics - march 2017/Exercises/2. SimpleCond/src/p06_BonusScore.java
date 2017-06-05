import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p06_BonusScore {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());
        double result = 0;
        if (a <= 100) {
            result += 5;
        } else if (a > 100 && a <= 1000 ) {
            result += a * 0.2;
        } else if (a > 1000) {
            result += a * 0.1;
        }
        if (a % 2 == 0){
            result += 1;
        } else if (a % 10 == 5){
            result += 2;
        }
        System.out.println(result);
        System.out.println(result + a);
    }
}
