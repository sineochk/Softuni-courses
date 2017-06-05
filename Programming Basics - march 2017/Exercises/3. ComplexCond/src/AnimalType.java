import java.util.Scanner;

/**
 * Created by 000 on 27.2.2017 г..
 */
public class AnimalType {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String animal = reader.nextLine();
        switch (animal){
            case "dog": System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default: System.out.println("unknown");
        }
    }
}
