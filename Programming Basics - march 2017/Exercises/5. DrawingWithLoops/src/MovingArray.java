/**
 * Created by 000 on 24.4.2017 г..
 */
public class MovingArray {
    public static void main(String[] args) throws InterruptedException {
        String[][] arr = new String[10][10];
        for (int i = 0; i < 10 ; i++) {

            arr[i][i]= "a";
            System.out.print(
                    strRepeat(" ", i)
            );
            System.out.println(arr[i][i]);
            Thread.sleep(1000);

            //не работи за windows
//            System.out.print("\033[H\033[2J");
//            System.out.flush();

        }
    }
    static String strRepeat(String repeatStr , int count){
        String text = "";
        for (int i = 0; i <count ; i++) {
            text = text + repeatStr;
        }
        return text;
    }
}
