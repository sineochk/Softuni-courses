import java.util.Scanner;

/**
 * Created by 000 on 29.3.2017 г..
 */
public class MinNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.nextLine());
            if(num < minNum){
                minNum = num;
            }
        }
        System.out.println(minNum);
    }
}
