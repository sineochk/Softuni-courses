import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p11_EqualWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String first = reader.nextLine();
        String second = reader.nextLine();

        if (first.toLowerCase().equals(second.toLowerCase())){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
