import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <=n ; i=i*2+1) {
            System.out.println(i);
        }
    }
}
