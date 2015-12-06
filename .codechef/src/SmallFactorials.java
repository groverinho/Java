import java.math.BigInteger;
import java.util.Scanner;


public class SmallFactorials {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++) 
		{
			int n  = in.nextInt();
			BigInteger num = BigInteger.ONE;
			for (int j = 2; j <= n; j++) 
				num = num.multiply(BigInteger.valueOf(j));
			System.out.println(num);
		}
	}
}
