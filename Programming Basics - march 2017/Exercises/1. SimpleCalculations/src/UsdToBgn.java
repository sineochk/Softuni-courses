import java.util.Scanner;


public class UsdToBgn {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double usd = Double.parseDouble(reader.nextLine());
        double toBgn = usd * 1.79549;
        System.out.printf("%.2f BGN", toBgn);
    }
}
