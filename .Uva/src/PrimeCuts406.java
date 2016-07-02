import java.util.*;
public class PrimeCuts406 {

    static boolean primoOno(int n) 
    {
        if (n == 1) {
            return true;
        }
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt(), c = in.nextInt();
            List<Integer> primos = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) 
            {
                if (primoOno(i)) 
                {
                	primos.add(i);
                }
            }
            System.out.print(n + " " + c + ":");
            int tamano = primos.size();
            int ini = 0;
            int tam = 0;
            if (tamano % 2 == 0) 
            {
            	tam = 2 * c;
                ini = (tamano - tam) / 2;
            } else 
            {
            	tam = 2 * c - 1;
                ini = (tamano - tam) / 2;
            }
            if (tam > tamano)
            {
            	ini = 0;
            	tam = tamano;
            }
            for (int i = ini; i < ini + tam; i++) 
                System.out.print(" " + primos.get(i));
            System.out.println("\n");
        }
    }
}