import java.util.Scanner;

/**
 * Created by 000 on 29.3.2017 г..
 */
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(reader.nextLine());
            if (i%2 == 1){
                sum1 += num;
            } else if (i%2 == 0){
                sum2 += num;
            }
        }if(sum1 == sum2){
            System.out.printf("Yes, sum = %d", sum1);
        } else{
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
