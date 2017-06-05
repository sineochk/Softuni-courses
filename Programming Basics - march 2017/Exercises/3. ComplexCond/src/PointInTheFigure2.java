import java.util.Scanner;

/**
 * Created by 000 on 7.3.2017 г..
 */
public class PointInTheFigure2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int height = Integer.parseInt(reader.nextLine());
        int x = Integer.parseInt(reader.nextLine());
        int y = Integer.parseInt(reader.nextLine());
        String output;

        if (x <= height * 3 && x >= 0 && y <= height * 4 && y >= 0){
            if(y<=height && (x==0 || x==height*3)) {
                output = "border";
            } else if(y==0) {
                output = "border";
            } else if(y==height && (x<=height || x>=height*2)) {
                output = "border";
            } else if((x==height || x==height*2) && y>=height && y<=height*4){
                output = "border";
            } else if(y==height*4 && x>=height && x<=height*2) {
                output = "border";
            } else if(y>0 && y<height) {
                output = "inside";
            } else if(x>height && x<height*2) {
                output = "inside";
            } else {
                output = "outside";
            }
        } else {
            output = "outside";
        }
        System.out.print(output);
    }
}
