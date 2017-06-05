import java.util.Scanner;

/**
 * Created by 000 on 30.3.2017 г..
 */
public class HalfSumElement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum= 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(reader.nextLine());
            if(num > maxNum){
                maxNum = num;
            }
            sum += num;
        }if(sum - maxNum == maxNum){
            System.out.printf("Yes, sum = %d%n", sum - maxNum);
        } else{
            System.out.printf("No, diff = %d", Math.abs(sum - (maxNum*2)));
        }
    }
}
