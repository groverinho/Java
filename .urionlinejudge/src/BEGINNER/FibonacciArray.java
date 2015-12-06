package BEGINNER;

import java.util.Scanner;

public class FibonacciArray {

	public static long fiboIterativo(long n)
	{
		if(n <= 2)
		{
			if(n==0)
				return 1;
			else
		return n;
		}
		long res = 0;
		long act = 1;
		long ant = 0;
		long i = 0;
		while( i < n )//n-1
		{
			long temp;
			res = act + ant;
			temp = act;
			act = res;
			ant = temp;
			i++;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			long n = in.nextInt();
			if (n==0)
			System.out.println("Fib(0) = 0");
			else
			System.out.println("Fib("+n+") = "+fiboIterativo(n-1));
			casos--;
		}	
	}
}
