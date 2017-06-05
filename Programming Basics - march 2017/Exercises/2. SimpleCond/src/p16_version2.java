import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p16_version2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());

        String[] toNineteen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] toNinety = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        if (num < 0 || num > 100) {
            System.out.printf("invalid number");
            return;
        }

        if(num>=20) {
            System.out.printf(toNinety[num/10]);
            if(num%10!=0) {
                System.out.println(" "+toNineteen[num%10]);
            }
        } else {
            System.out.println(toNineteen[num]);
        }

    }
}
