// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 2015-11-09

import java.util.Scanner;


public class DisastrousDowntime {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     int n, k, t, maximo, r;
       n=in.nextInt();
       k=in.nextInt();
        int [] result = new int[101001];
        maximo = 0;
        for (int j = 0; j < n; j++)
        {
           t=in.nextInt();
            for (int i = 0; i < 1000; i++)
            {
                result[t + i]++;
                maximo = Math.max(maximo, result[t + i]);
            }
        }
        r = (int) Math.ceil((double)maximo / (double)k);
       System.out.println(r);
    }

}