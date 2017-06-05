import java.util.Scanner;

/**
 * Created by 000 on 22.4.2017 г..
 */
public class NumberTable3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int[][] nums = new int[n][n];
        int count = 0;
        int i = 0;
        int j = n-1;
        int mirror = j-i;

        while (n > 0){
            nums[i][j]= nums[j][i] = n;
            nums[i][mirror] = n;
            nums[count][j]= n;
            i++;
            j--;
            if (i==n) {
                count++;
                n--;
                i=0;
                j=n-1+count;

            }
        }
        for (int col = 0; col < nums.length; col++) {
            for (int row = 0; row < nums[col].length; row++) {
                System.out.print(nums[col][row] + " ");
            }
            System.out.println();
        }
    }
}
