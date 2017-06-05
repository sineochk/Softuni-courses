import java.util.Scanner;

/**
 * Created by sineochk on 4.4.2017 г..
 */
public class House {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        int stars = n%2==0 ? 2 : 1;
        int roof = n%2==0 ? n/2 : (n+1)/2;
        for (int i = 0; i < roof; i++) {
            System.out.printf("%s%s%s"+System.getProperty("line.separator"),
                    House.repeatStr("-",(n-stars)/2),
                    House.repeatStr("*",stars),
                    House.repeatStr("-",(n-stars)/2)
            );
            stars+= 2;
        }
        for (int i = 0; i < n-roof; i++) {
            System.out.printf("|%s|"+System.getProperty("line.separator"),
                    House.repeatStr("*",n-2)
            );
            stars+= 2;
        }
    }
    static String repeatStr (String strRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text + strRepeat;
        }
        return text;
    }
}
