import java.util.Scanner;


public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double money =  Double.parseDouble(reader.nextLine());
        String firstCurrency = reader.nextLine();
        double toBgn = 0;
        String secondCurrency = reader.nextLine();
        switch (firstCurrency.toUpperCase()){
            case "BGN": toBgn = money; break;
            case  "USD": toBgn = money * 1.79549; break;
            case  "EUR": toBgn = money * 1.95583; break;
            case  "GBP": toBgn = money * 2.53405; break;
        }
        switch (secondCurrency.toUpperCase()){
            case "BGN": money = toBgn; break;
            case  "USD": money = toBgn / 1.79549; break;
            case  "EUR": money = toBgn / 1.95583; break;
            case  "GBP": money = toBgn / 2.53405; break;
        }
        System.out.printf("%.2f %s", money, secondCurrency);
    }
}
