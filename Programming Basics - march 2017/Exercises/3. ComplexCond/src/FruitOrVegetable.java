import java.util.Scanner;

/**
 * Created by 000 on 28.2.2017 г..
 */
public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String product = reader.nextLine();

        if (product.equals("banana") || product.equals("apple") ||
                product.equals("kiwi") || product.equals("cherry") ||
                product.equals("lemon") || product.equals("grapes")){

            System.out.println("fruit");
        } else if (product.equals("tomato") || product.equals("cucumber") ||
                product.equals("pepper") || product.equals("carrot")){

            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
