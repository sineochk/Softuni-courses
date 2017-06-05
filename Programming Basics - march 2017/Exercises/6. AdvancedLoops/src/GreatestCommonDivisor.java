import java.util.Scanner;

/**
 * Created by 000 on 12.4.2017 г..
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1= Integer.parseInt(reader.nextLine());
        int n2 = Integer.parseInt(reader.nextLine());
        int maxDiv = 0;
        int biggerNum =0;
        int lowerNum = 0;
        if (n1>n2) {
        biggerNum = n1;
        lowerNum = n2;
        } else {
            biggerNum = n2;
            lowerNum = n1;
        }
        for (int i=lowerNum; i>=1; i--){
            if(biggerNum%lowerNum==0){
                maxDiv = lowerNum;
                System.out.println(maxDiv);
                break;
            } else {


            }
        }
    }
}
