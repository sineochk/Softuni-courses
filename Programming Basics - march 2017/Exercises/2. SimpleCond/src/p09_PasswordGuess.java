import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p09_PasswordGuess {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = reader.nextLine();
         if(password.equals("s3cr3t!P@ssw0rd")){
             System.out.println("Welcome");
        }else{
             System.out.println("Wrong password!");
         }
    }
}

