import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());
        if (a % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
