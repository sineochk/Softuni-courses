import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p15_3EqualNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = Integer.parseInt(reader.nextLine());
        int num2 = Integer.parseInt(reader.nextLine());
        int num3 = Integer.parseInt(reader.nextLine());

        if (num1 == num2 && num1 == num3){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
