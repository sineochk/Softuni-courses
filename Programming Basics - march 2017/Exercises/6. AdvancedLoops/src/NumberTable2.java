import java.util.Scanner;

/**
 * Created by 000 on 20.4.2017 г..
 */
public class NumberTable2 {
    public static void main(String[] args) {
        NumberTable.main(args);
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int num;
        boolean inc;

        for (int row = 1; row <= n ; row++) {
            num  = row;
            inc = true;
            for (int col = 1; col <= n; col++) {
                System.out.print(num + " ");
                if (inc && num >= n) {
                    inc = false;
                }
                if(inc) {
                    num++;
                } else {
                    num--;
                }
            }
            System.out.println();
        }
    }

    public void test() {
        System.out.print("NumberTable2 test method");
    }
}
