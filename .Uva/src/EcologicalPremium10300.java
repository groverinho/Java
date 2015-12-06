

import java.util.*;

public class EcologicalPremium10300 {
    public static void main(String[] args) {
   
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int i = 1; i <= n; ++i)
            {
                int sum = 0;
                int f = in.nextInt();
                for (int j = 1; j <= f; ++j)
                {
                    int tam = in.nextInt();
                    int animals = in.nextInt();
                    int c = in.nextInt();

                    sum += tam * c;
                }
                System.out.println(sum);
            }
        
    }
}
