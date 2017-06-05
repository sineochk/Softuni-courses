import java.util.Scanner;

/**
 * Created by sineochk on 19.2.2017 г..
 */
public class p08_MetricConverter {
    public static void main(String[] args) {
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double toMeters = 0;

        Scanner reader = new Scanner(System.in);
        double number = Double.parseDouble(reader.nextLine());
        String first = reader.nextLine();
        String second = reader.nextLine();

        if (first.equals("mm")){
            toMeters = number / mm;
        }else if (first.equals("cm")){
            toMeters = number / cm;
        }else if (first.equals("mi")){
            toMeters = number / mi;
        }else if (first.equals("in")){
            toMeters = number / in;
        }else if (first.equals("km")){
            toMeters = number / km;
        }else if (first.equals("ft")){
            toMeters = number / ft;
        }else if (first.equals("yd")){
            toMeters = number / yd;
        }else if (first.equals("m")){
            toMeters = number;
        }
        if (second.equals("mm")) {
            System.out.println( String.format("%s",toMeters * mm) + " mm");
        }else if (second.equals("cm")) {
            System.out.println( String.format("%s",toMeters * cm) + " cm");
        }else if (second.equals("mi")) {
            System.out.println( String.format("%s",toMeters * mi) + " mi");
        }else if (second.equals("in")) {
            System.out.println( String.format("%s",toMeters * in) + " in");
        }else if (second.equals("km")) {
            System.out.println( String.format("%s",toMeters * km) + " km");
        }else if (second.equals("ft")) {
            System.out.println( String.format("%s",toMeters * ft) + " ft");
        }else if (second.equals("yd")) {
            System.out.println( String.format("%s",toMeters * yd) + " yd");
        }else if (second.equals("m")) {
            System.out.println( String.format("%s",toMeters ) + " m");
        }
    }
}
