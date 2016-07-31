import java.math.BigInteger;
import java.util.Scanner;


public class triangularNumbers {

	public static BigInteger  sum( BigInteger  n)
	{
		//  return (n * (n+1)) / 2;
		return n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (true)
		{
		String cad = in.next();
			if (cad.equals("0"))
			{
				break;
			}
			BigInteger n = new BigInteger(cad);
			double temp = Math.sqrt(n.doubleValue()*2);
		//	System.out.println(temp);
			if (sum(BigInteger.valueOf((long) temp)).compareTo(n)==0) 
			{
				System.out.println("YES");
			}
			else System.out.println("NO"); 
		}

	}

}
