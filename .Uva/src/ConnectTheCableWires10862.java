import java.math.BigInteger;
import java.util.Scanner;


public class ConnectTheCableWires10862 {

	public static void fibo(BigInteger[] fib)
	{
		    fib[1] = BigInteger.ONE;
	        fib[2] = BigInteger.valueOf(1);
	        for (int i = 3; i <= 5001; i++) 
	        {
	            fib[i] = fib[i - 1].add(fib[i - 2]);
	        }

	}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BigInteger[] fib = new BigInteger[5002];
        fibo(fib);
        int i = in.nextInt();
        while (i!=0)
        {  
            System.out.println (fib[2*i]);
            i = in.nextInt();
        }
    }
}