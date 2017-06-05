import java.util.Scanner;

/**
 * Created by 000 on 4.4.2017 г..
 */
public class SquareOfStars2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < n ; i++) {
            //използваме метода, който сме направили в класа RepeatStrMethod
            System.out.print(RepeatStrMethod.RepeatStr("$ ", n));
            System.out.println();
        }

    }
}
