package MATHEMATICS;

import java.util.Scanner;


public class FastPrimeNumber {

	public static boolean esPrimo (int x)
	{
		  if (x == 2)
		    return true;
		  if (x%2 == 0)
		    return false;
		  int max=(int) Math.sqrt(x);
		  for (int k = 3; k < max; k+=2)
		    if (x%k == 0)
		      return false;
		  return true;
		}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();


			  for (int i = 0; i < casos; i++)
			  {
				   int x = in.nextInt();
			    if (esPrimo(x))
			      System.out.println("Prime");
			    else
			    	  System.out.println("Not Prime");
			  }

}
}
