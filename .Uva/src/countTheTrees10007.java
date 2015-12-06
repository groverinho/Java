import java.io.*;
import java.util.*;
import java.math.*;
public class countTheTrees10007
{
    static BigDecimal fact[] = new BigDecimal[601];
    static BigDecimal result[] = new BigDecimal[301];

    public static void precalc_factorial()
    {
        fact[0] = new BigDecimal(1);
        fact[1] = new BigDecimal(1);

        for (int i = 2; i < 601; i++) 
            fact[i] = fact[i-1].multiply(new BigDecimal(i));
        
    }
    public static void main(String args[])
    {
    	 precalc_factorial();
         for (int i = 1; i < 301; i++) 
             result[i] = fact[2*i].divide(fact[i+1]);
         
           Scanner in = new Scanner((System.in));
         while (true)
         {
             int n = in.nextInt();
             if (n == 0)
                 break;
             System.out.println(result[n]);
         }
    }
}