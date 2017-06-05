
import java.util.Scanner;

/**
 * Created by sineochk on 1.5.2017 г..
 * start: 16:15
 * finish: 16:32
 */
public class P04_TrainersSalary {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lessons = Integer.parseInt(reader.nextLine());
        double budget = Double.parseDouble(reader.nextLine());
        double moneyPerLesson = budget/ lessons;
        double JelevSalary =0.0;
        double RoYalSalary =0.0;
        double RoliSalary =0.0;
        double TrofonSalary =0.0;
        double SinoSalary =0.0;
        double othersSalary =0.0;
        for (int i = 0; i < lessons; i++) {
            String teacher = reader.nextLine();
            switch (teacher){
                case "Jelev":
                    JelevSalary+= moneyPerLesson;
                    break;
                case "RoYaL":
                    RoYalSalary+= moneyPerLesson;
                    break;
                case "Roli":
                    RoliSalary+= moneyPerLesson;
                    break;
                case "Trofon":
                    TrofonSalary+= moneyPerLesson;
                    break;
                case "Sino":
                    SinoSalary+= moneyPerLesson;
                    break;
                default:
                    othersSalary+= moneyPerLesson;
            }
        }
        System.out.printf("Jelev salary: %.2f lv\n", JelevSalary);
        System.out.printf("RoYaL salary: %.2f lv\n", RoYalSalary);
        System.out.printf("Roli salary: %.2f lv\n", RoliSalary);
        System.out.printf("Trofon salary: %.2f lv\n", TrofonSalary);
        System.out.printf("Sino salary: %.2f lv\n", SinoSalary);
        System.out.printf("Others salary: %.2f lv", othersSalary);
    }
}
