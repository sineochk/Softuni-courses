import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by 000 on 29.3.2017 г..
 */
public class VowelsSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length() ; i++) {
             switch(text.charAt(i)){
                 case 'a': sum += 1;
                     break;
                 case 'e': sum += 2;
                     break;
                 case 'i': sum += 3;
                     break;
                 case 'o': sum += 4;
                     break;
                 case 'u': sum += 5;
                     break;
             }
        }
        System.out.println(sum);
    }
}
