import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        if (!(num>= 100 && num <=200) && num !=0){  // kogato ne e v diapazona i kogato ne e 0
            System.out.println("Invalid");
        }
    }
}
