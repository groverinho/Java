
import java.util.Scanner;

public class Bee11000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) 
        {
            int years = in.nextInt();
            if (years == -1) 
                break;
            
            long hembra = 1;
            long macho = 0;
            for (int i = 0; i < years; i++) 
            {
                long nacemacho = 1 + (hembra - 1);//caso especial
                long nacehembra = (macho) - (hembra - 1);//machos  producen hembras (hembras mueren)
                macho += nacemacho;
                hembra += nacehembra;
            }
            System.out.println(macho + " " + (hembra + macho));
        }
    }
}
