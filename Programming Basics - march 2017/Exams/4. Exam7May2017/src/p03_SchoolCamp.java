import java.util.Scanner;

/**
 * Created by 000 on 7.5.2017 г..
 */
public class p03_SchoolCamp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String season = reader.nextLine();
        String groupType = reader.nextLine();
        int students = Integer.parseInt(reader.nextLine());
        int days = Integer.parseInt(reader.nextLine());
        double pricePerDay;
        String sport = "";


        if (season.equals("Winter")) {
            if (groupType.equals("boys") ||groupType.equals("girls")) {
                pricePerDay = 9.6;
            } else {
                pricePerDay = 10;
            }
        } else if (season.equals("Spring")) {
            if (groupType.equals("boys") ||groupType.equals("girls")) {
                pricePerDay = 7.2;
            } else  {
                pricePerDay = 9.5;
            }
        }else  {
            if (groupType.equals("boys") ||groupType.equals("girls")) {
                pricePerDay = 15.0;
            } else  {
                pricePerDay = 20.0;
            }
        }
        if (season.equals("Winter")) {
            if (groupType.equals("girls")) {
                sport = "Gymnastics";
            } else if (groupType.equals("boys")) {
                sport = "Judo";
            }else if (groupType.equals("mixed")) {
                sport = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (groupType.equals("girls")) {
                sport = "Athletics";
            } else if (groupType.equals("boys")) {
                sport = "Tennis";
            }else if (groupType.equals("mixed")) {
                sport = "Cycling";
            }
        } else {
            if (groupType.equals("girls")) {
                sport = "Volleyball";
            } else if (groupType.equals("boys")) {
                sport = "Football";
            }else if (groupType.equals("mixed")) {
                sport = "Swimming";
            }
        }

        double totalPrise = students * pricePerDay * days;
        if (students >= 50) {
            totalPrise = totalPrise -(totalPrise * 0.5);

        } else if (students >= 20) {
            totalPrise = totalPrise -(totalPrise * 0.15);
        } else if(students >= 10){
            totalPrise = totalPrise -(totalPrise * 0.05);
        }
        System.out.printf("%s %.2f lv.", sport, totalPrise);

    }
}
