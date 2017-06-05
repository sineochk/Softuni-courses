import java.util.Scanner;

/**
 * Created by 000 on 29.3.2017 г..
 */
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 2*n ; i++) {
            int num = Integer.parseInt(reader.nextLine());
            if (i<n){
                sum1 += num;
            } else {
                sum2 += num;
            }
        }if(sum1 == sum2){
            System.out.printf("Yes, sum = %d", sum1);
        } else{
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
