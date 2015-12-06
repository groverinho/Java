package MATHEMATICS;
import java.math.BigInteger;
import java.util.Scanner;


public class HashmatelBraveWarrior {

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
		
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		int comprobar = a.compareTo(b);
		if (comprobar == 0)
		{
		System.out.println(0);	
		}
		else if (comprobar==1)
		{
			a= a.subtract(b);
			System.out.println(a);
		}
		else if (comprobar==-1)
		{
			b = b.subtract(a);
			System.out.println(b);
		}
		
	}

}
