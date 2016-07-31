

import java.math.BigInteger;
import java.util.Scanner;

 public class Julka
 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 for(int i = 0; i < 10; i++)
	     {
			BigInteger x= new BigInteger(in.next());
			BigInteger y= new BigInteger(in.next());
			BigInteger z= null;
			z = x.add(y).divide(new BigInteger("2"));
//			z = x.add(y);
//			z = x.subtract(y);
//			z = x.multiply(y);
			System.out.println(z);
			z = x.subtract(z);
			System.out.println(z); 
		}

	}
 }
