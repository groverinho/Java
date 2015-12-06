package ADHOC;
import java.math.BigInteger;
import java.util.Scanner;

public class ToCarryornottoCarry {

	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		while (in.hasNextBigInteger()) 
		{
	  BigInteger a= in.nextBigInteger();
		BigInteger b= in.nextBigInteger();
		BigInteger n = null;
		   n = a.or(b);
		  System.out.println(n);
		  }
	
	}

}
