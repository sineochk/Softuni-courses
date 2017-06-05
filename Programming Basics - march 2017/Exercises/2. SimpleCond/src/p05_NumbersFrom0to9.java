import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p05_NumbersFrom0to9 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());

        switch (a) {
            case 1: System.out.println("one");
                break;
            case 2: System.out.println("two");
                break;
            case 3: System.out.println("three");
                break;
            case 4: System.out.println("four");
                break;
            case 5: System.out.println("five");
                break;
            case 6: System.out.println("six");
                break;
            case 7: System.out.println("seven");
                break;
            case 8: System.out.println("eight");
                break;
            case 9: System.out.println("nine");
                break;
        } if (a>=10) {
               System.out.println("number too big");
           }
        }

    }

