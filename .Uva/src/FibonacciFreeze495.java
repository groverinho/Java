import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciFreeze495 {

	
	
	
	public static void fibo(BigInteger[] fib)
	{
		    fib[0] = BigInteger.ZERO;
	        fib[1] = BigInteger.ONE;
	        for (int i = 2; i <= 5001; i++) 
	        {
	            fib[i] = fib[i - 1].add(fib[i - 2]);
	        }

	}
	public static void fibo2(int[] fib)
	{
		    fib[0] = 0;
	        fib[1] = 1;
	        for (int i = 2; i <= 46; i++) 
	        {
	            fib[i] = fib[i - 1]+fib[i - 2];
	        }

	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger[] fib = new BigInteger[5002];
        fibo(fib);
       
       int vec []= new int [47];
       fibo2(vec);
       for (int i = 0; i < vec.length; i++) {
		System.out.println(vec[i]);
	}
//        while (in.hasNextInt())
//        {
//            int i = in.nextInt();
//            System.out.println
//            ("The Fibonacci number for " + i + " is " + fib[i]);
//        }
    }
}