import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OneThousandDays {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(reader.nextLine(), formatter);
        date = date.plusDays(999L);
        System.out.print(date.format(formatter));

    }

}
