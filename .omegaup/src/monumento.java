import java.math.BigInteger;
import java.util.Scanner;

// Author: Grover Irusta

// Date: 21-02-17

public class monumento{

	public static void fibo(BigInteger[] fib)
	{
		    fib[0] = BigInteger.ZERO;
	        fib[1] = BigInteger.ONE;
	        for (int i = 2; i <= 1000100; i++) 
	        {
	            fib[i] = fib[i - 1].add(fib[i - 2]).mod(BigInteger.valueOf(1000000));
	            
	        }
	        

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		  BigInteger[] fib = new BigInteger[1002000];
	        fibo(fib);
	        System.out.println(fib[n+1]);
	}

}