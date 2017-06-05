import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();
        String lastName = reader.nextLine();
        int age = Integer.parseInt(reader.nextLine());
        String city = reader.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, city);
    }
}
