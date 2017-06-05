import java.util.Scanner;

/**
 * Created by 000 on 20.4.2017 г..
 */
public class GreatestCommonDivisor1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());

        //
        while(b>0){
            int oldB = b;
            b = a%b;   //остатък
            a = oldB;
        }
        System.out.println(a);
    }
}
