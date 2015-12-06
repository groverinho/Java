package PARADIGMAS;

import java.util.Scanner;

public class FibonacciHowManyCalls {

	public static int c = 0;
	 static int c2 = 0;
	public static int Fibonacci (int n)
	{
		c++;
		 if(n==1 || n==0)
		 {
			c2+=n;
			 return n;
		 }
		    return Fibonacci(n-1)+Fibonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos > 0) 
		{
			int n = in.nextInt();
			Fibonacci(n);
			System.out.println("fib ("+n+") = "+(c-1)+ " llamadas = "+c2);
			//llamadas=0;
			c=0;
			c2=0;
			casos--;
		}
		
	}

}
