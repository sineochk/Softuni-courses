import java.util.Scanner;

/**
 * Created by 000 on 20.4.2017 г..
 */
public class TryCatch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

         try {
             int n = Integer.parseInt(reader.nextLine());
             while (n%2 !=0){
                 n = Integer.parseInt(reader.nextLine());
             }
             System.out.println(n);

         }catch (NumberFormatException ex){
             System.out.println("Invalid input");
         }
    }
}
