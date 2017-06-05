import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p16_Number0to100toText {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());

        String[] toNineteen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] toNinety = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

         if (num < 0 || num > 100) {
            System.out.printf("invalid number");
        }
        else if (num <= 19 ) {
            System.out.println(toNineteen[num]);
        } else if (num <= 29) {
            if (num == 20){
                System.out.printf(toNinety[0]);
            } else {
                System.out.printf("%s %s",toNinety[0], toNineteen[num - 20] );
            }
        } else if (num <= 39) {
            if (num == 30){
                System.out.printf(toNinety[1]);
            } else {
                System.out.printf("%s %s",toNinety[1], toNineteen[num - 30] );
            }
        } else if (num <= 49) {
            if (num == 40){
                System.out.printf(toNinety[2]);
            }else {
                System.out.printf("%s %s",toNinety[2], toNineteen[num - 40] );
            }
        } else if (num <= 59) {
            if (num == 50){
                System.out.printf(toNinety[3]);
            } else {
                System.out.printf("%s %s",toNinety[3], toNineteen[num - 50] );
            }
        } else if (num <= 69) {
            if (num == 60){
                System.out.printf(toNinety[4]);
            } else {
                System.out.printf("%s %s",toNinety[4], toNineteen[num - 60] );
            }
        } else if (num <= 79) {
            if (num == 70){
                System.out.printf(toNinety[5]);
            } else {
                System.out.printf("%s %s",toNinety[5], toNineteen[num - 70] );
            }
        } else if (num <= 89) {
            if (num == 80){
                System.out.printf(toNinety[6]);
            } else {
                System.out.printf("%s %s",toNinety[6], toNineteen[num - 80] );
            }
        } else if (num <= 99) {
            if (num == 90){
                System.out.printf(toNinety[7]);
            } else {
                System.out.printf("%s %s",toNinety[7], toNineteen[num - 90] );
            }
        } else if (num == 100){
            System.out.printf("one hundred");
        }


    }
}
