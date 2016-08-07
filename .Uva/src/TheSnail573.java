

import java.util.*;

public class TheSnail573 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
//573 - The Snail
        while (true) 
        {
            double H = in.nextDouble();
            double U = in.nextDouble();
            double D = in.nextDouble();
            double F = in.nextDouble();
            if (H == 0) break;
            int k = 1;
            double perdida = U * F / 100.0;
            double distancia = 0;
            while (true) {
                if (U >= 0)
                    distancia += U;
                if (distancia > H) {
                    System.out.println("success on day " + k);
                    break;
                }
                distancia -= D;
                if (distancia < 0) {
                    System.out.println("failure on day " + k);
                    break;
                }

                U -= perdida;
                k++;
            }
        }
    }
}