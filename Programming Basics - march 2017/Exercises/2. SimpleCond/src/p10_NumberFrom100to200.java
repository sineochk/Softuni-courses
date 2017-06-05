import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p10_NumberFrom100to200 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        if (number < 100){
            System.out.printf("Less than 100");
        }
        else if(number >= 100 && number <= 200 ){
            System.out.printf("Between 100 and 200");
        }
        else if(number > 200){
            System.out.printf("Greter than 200");
        }
    }
}
