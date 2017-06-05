import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int hours = Integer.parseInt(reader.nextLine());
        int minutes = Integer.parseInt(reader.nextLine());
        int totalminutes = hours*60 + minutes + 15;
        int newHour = totalminutes / 60;
        int newMinutes = totalminutes % 60;

        if (newHour > 23) {
            if (newMinutes < 10){
                System.out.printf("0:0%d", newMinutes);
            } else if (newMinutes > 44){
                newHour++;
                System.out.printf("0:0%d", newMinutes);
            } else if (newMinutes > 9 && newMinutes <= 44){
                System.out.printf("0:%d", newMinutes);
            }
        }
        else if (newHour < 23){
            if (newMinutes < 10){
                System.out.printf("%d:0%d",newHour, newMinutes);
            }else if (newMinutes > 44){
                System.out.printf("%d:0%d",newHour, newMinutes);
            } else if (newMinutes > 9 && newMinutes <= 44){
                System.out.printf("%d:%d",newHour, newMinutes);
            }
        }

        //второ решение (еднакви са)

        if (newMinutes < 10){
            if (newHour > 23) {
                System.out.printf("0:0%d", newMinutes);
            } else if (newHour < 23){
                System.out.printf("%d:0%d",newHour, newMinutes);
            }
        }
        if (newMinutes > 44){
            newHour++;
            if (newHour > 23) {
                System.out.printf("0:0%d", newMinutes);
            } else if (newHour < 23){
                System.out.printf("%d:0%d",newHour, newMinutes);
            }
        }
        if (newMinutes > 9 && newMinutes <= 44){
            if (newHour > 23) {
                System.out.printf("0:%d", newMinutes);
            } else if (newHour < 23){
                System.out.printf("%d:%d",newHour, newMinutes);
            }
        }
    }


}
