import java.util.Scanner;

/**
 * Created by 000 on 30.3.2017 г..
 */
public class EqualPairs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        boolean isEqual = true;
        int maxDiff = 0;
        int currentDif;

        for (int i = 0; i < n ; i++) {
            int x1 = Integer.parseInt(reader.nextLine());
            int x2 = Integer.parseInt(reader.nextLine());
            if(i != 0) {
                if(x1+x2 != sum) {
                    currentDif = Math.abs((x1+x2) - sum);
                    if(isEqual) {
                        maxDiff = currentDif;
                    } else if (currentDif > maxDiff) {
                        maxDiff = currentDif;
                    }
                    isEqual = false;
                }
            }
            sum = x1+x2;
        }
        if (isEqual) {
            System.out.printf("Yes, value=%d", sum);
        }else{
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
