import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p04_GreaterNumber {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
