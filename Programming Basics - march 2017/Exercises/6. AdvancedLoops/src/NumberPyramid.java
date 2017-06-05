import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int num = 1;

            for (int i = 1; i <= n ; i++) {
                for (int j = 0; j < i ; j++) {
                    if(num>n){
                        break;
                    }
                    System.out.print(num + " ");
                    num ++;
                }
                System.out.println();
            }
    }
}
