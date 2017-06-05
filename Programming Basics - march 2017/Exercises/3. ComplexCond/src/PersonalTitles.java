import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double age = Double.parseDouble(reader.nextLine());
        String title = reader.nextLine();

            if (title.equals("m")) {
                if (age >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
            } else{
                if (age >=16){
                    System.out.println("Ms.");
                }else {
                    System.out.println("Miss");
                }
            }
    }
}
