import java.util.Scanner;

/**
 * Created by 000 on 19.2.2017 г..
 */
public class p16_extended {

    static String[] toNineteen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] toNinety = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        boolean space = false;

        if (num < 0 || num >= 100000) {
            System.out.printf("invalid number");
            return;
        }

        if(num>1000) {
            upToHundred(num/1000);
            System.out.print(" thousand");
            num = num%1000;
            space = true;
        }

        if(num>100) {
            if(space) {
                System.out.print(" ");
            } else {
                space = true;
            }
            upToHundred(num/100);
            System.out.print(" hundred");
            num = num%100;
        }

        if(num>=20) {
            if(space) {
                System.out.print(" ");
            } else {
                space = true;
            }
            System.out.print(toNinety[num/10]);
            if(num%10!=0) {
                System.out.print(" "+toNineteen[num%10]);
            }
        } else {
            if(space) {
                System.out.print(" ");
            } else {
                space = true;
            }
            System.out.print(toNineteen[num]);
        }

    }

    public static void upToHundred(int num) {
        if(num>=20) {
            System.out.print(toNinety[num/10]);
            if(num%10!=0) {
                System.out.print(" "+toNineteen[num%10]);
            }
        } else {
            System.out.print(toNineteen[num]);
        }
    }
}
