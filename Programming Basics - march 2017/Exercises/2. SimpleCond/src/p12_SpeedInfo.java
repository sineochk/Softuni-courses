import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p12_SpeedInfo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double speed = Double.parseDouble(reader.nextLine());
        if (speed<= 10){
            System.out.println("slow");
        } else if(speed <= 50){
            System.out.println("average");
        }else if (speed <= 150){
            System.out.println("fast");
        } else if (speed <= 1000){
            System.out.println("ultra fast");
        } else {
            System.out.println(" extremely fast");
        }
    }
}
