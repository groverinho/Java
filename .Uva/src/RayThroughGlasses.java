import java.math.BigInteger;
import java.util.Scanner;


public class RayThroughGlasses {

	public static void fibo(BigInteger[] fib)
	{
		    fib[0] = BigInteger.ONE;
	        fib[1] = BigInteger.valueOf(2);
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
            int i = in.nextInt();
            System.out.println
            (fib[i]);
        }
    }
}