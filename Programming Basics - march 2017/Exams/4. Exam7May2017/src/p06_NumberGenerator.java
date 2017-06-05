import java.util.Scanner;

/**
 * Created by 000 on 7.5.2017 г..
 */
public class p06_NumberGenerator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = Integer.parseInt(reader.nextLine());
        int n = Integer.parseInt(reader.nextLine());
        int l =Integer.parseInt(reader.nextLine());
        int specialNumber = Integer.parseInt(reader.nextLine());
        int controlNumber = Integer.parseInt(reader.nextLine());
        for (int i = m; i >=1 && !(specialNumber >= controlNumber) ; i--) {
            for (int j = n; j >=1 && !(specialNumber >= controlNumber); j--) {
                for (int k = l; k >=1 && !(specialNumber >= controlNumber) ; k--) {
                    String num = i+""+j+""+k;

                    if (Integer.parseInt(num) % 3 ==0) {
                        specialNumber +=5;
                    } else if (Integer.parseInt(num) % 10 ==5) {
                        specialNumber -=2;
                    } else if (Integer.parseInt(num) % 2 ==0) {
                        specialNumber*=2;
                    }
                }
            }
        }
        if (controlNumber > specialNumber) {
            System.out.printf("No! %d is the last reached special number.", specialNumber);

        } else {
            System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNumber);
        }
        
        
    }
}
