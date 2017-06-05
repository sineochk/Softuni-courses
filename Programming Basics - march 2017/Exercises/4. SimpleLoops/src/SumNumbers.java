import java.util.Scanner;

/**
 * Created by 000 on 29.3.2017 г..
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.nextLine());
            sum += num;
        }
        System.out.println(sum);
    }
}
