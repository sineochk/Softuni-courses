import java.util.Scanner;

/**
 * Created by sineochk on 4.4.2017 г..
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = Integer.parseInt(reader.nextLine());

        int middleElements = n%2==0 ? 2 : 1;  //броя на елементите в средата (*, -)
        int middleDash = middleElements;   // броя на (-) на 2 ред ВИНАГИ = броя на средните елем. на 1 ред
        int roof = n%2==0 ? n/2 : (n+1)/2;

        for (int i = 0; i < roof; i++) {
            if (i==0) {
                System.out.printf("%s%s%s"+System.getProperty("line.separator"),
                        repeatStr("-",(n-middleElements)/2),
                        repeatStr("*", middleElements),
                        repeatStr("-",(n-middleElements)/2)
                );
            }else{
                System.out.printf("%s*%s*%s"+System.getProperty("line.separator"),
                        repeatStr("-",(n-middleElements)/2),
                        repeatStr("-", middleDash),
                        repeatStr("-",(n-middleElements)/2)
                );
                middleDash+=2;
            }
            middleElements+= 2;
        }
        middleDash-=4;  // 2 хода назад
        middleElements-= 4;

        for (int i = roof-1; i > 0; i--) {
            if (i!=1) {
                System.out.printf("%s*%s*%s"+System.getProperty("line.separator"),
                        repeatStr("-",(n-middleElements)/2),
                        repeatStr("-", middleDash),
                        repeatStr("-",(n-middleElements)/2)
                );
            } else {
                System.out.printf("%s%s%s"+System.getProperty("line.separator"),
                        repeatStr("-",(n-middleElements)/2),
                        repeatStr("*", middleElements),
                        repeatStr("-",(n-middleElements)/2)
                );
            }
            middleDash-=2;
            middleElements-= 2;
        }
    }
    static String repeatStr(String strRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strRepeat;
        }
        return text;
    }
}
