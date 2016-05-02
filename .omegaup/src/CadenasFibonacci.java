import java.math.BigInteger;
import java.util.Scanner;


public class CadenasFibonacci {
	public static void fibo(BigInteger[] fib)
	{
		    fib[0] = BigInteger.ONE;
	        fib[1] = BigInteger.ONE;
	        for (int i = 2; i <= 5001; i++) 
	        {
	            fib[i] = fib[i - 1].add(fib[i - 2]);
	        }
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger[] fib = new BigInteger[5002];
fibo(fib);
       
        while (in.hasNextInt())
        {
            int n = in.nextInt();
            BigInteger big = BigInteger.ZERO;
       //     System.out.println (fib[n]);
            for (int j = 1; j <= n; j++) 
            {
            	big = big.add(fib[j]);
				 
			}
           System.out.println(big.mod(BigInteger.valueOf(1000000007)));
        }
    }

}
