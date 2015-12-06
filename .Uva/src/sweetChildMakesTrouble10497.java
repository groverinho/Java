import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class sweetChildMakesTrouble10497 {

	 public static void main(String[] args) throws IOException
	 {
	        Scanner sc = new Scanner(System.in);
	        BigInteger fib[] = new BigInteger[801];
	        fib[0] = BigInteger.ZERO;
	        fib[1] = BigInteger.ZERO;
	        fib[2] = BigInteger.ONE;
	        fib[3] = BigInteger.valueOf(2);
	        for (int i = 4; i < 10; i++) 
	        {
	        	fib[i] = (fib[i - 2].add(fib[i - 1])).multiply(BigInteger.valueOf(i - 1));
	        	System.out.println(fib[i]);
	        }
	            
	        
	        while (true) 
	        {
	            int m = sc.nextInt();
	            if (m == -1)
	                break;
	            System.out.println(fib[m]);
	        }
	       
	    }

	}