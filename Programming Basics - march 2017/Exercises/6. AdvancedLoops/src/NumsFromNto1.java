import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class NumsFromNto1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
