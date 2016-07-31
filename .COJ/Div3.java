import java.math.BigInteger;
import java.util.Scanner;


public class Div3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = "";
		long n = in.nextLong();
//		int c=0;
//		for (int i = 1; i <=n; i++) 
//		{
//			cad+=i;
//			BigInteger num = new BigInteger(cad);
//			if (num.mod(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO)==0)
//			{
//				c++;
//				System.out.println(cad);
//			}
//			
//		}
//		System.out.println();
//		System.out.println(c);
		System.out.println(Math.round(n-Math.ceil((double)n/3)));


	}

}
