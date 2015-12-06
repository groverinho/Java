package BEGINNER;
import java.util.Scanner;

public class Experiments {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumC = 0;int sumR = 0;int sumS = 0;
        for(int i = 0; i < n; i++)
        {
            int cantidad = in.nextInt();
            char s = in.next().charAt(0);
            if (s =='C') 
                sumC += cantidad;
            else if(s=='R')
                sumR += cantidad;
            else if(s=='S')
                sumS += cantidad;
        }
        int sumTotal = sumC + sumR + sumS;
        System.out.printf("Total: %d cobaias\n", sumTotal);
        System.out.printf("Total de coelhos: %d\n", sumC);
        System.out.printf("Total de ratos: %d\n", sumR);
        System.out.printf("Total de sapos: %d\n", sumS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (double) 100 * sumC / sumTotal);
        System.out.printf("Percentual de ratos: %.2f %%\n", (double) 100 * sumR / sumTotal);
        System.out.printf("Percentual de sapos: %.2f %%\n", (double) 100 * sumS / sumTotal);
    }
}