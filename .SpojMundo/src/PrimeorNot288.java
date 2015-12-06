

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeorNot288 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger bi=BigInteger.valueOf(in.nextLong());
		System.out.println("big "+bi.longValue());
		for (int i = 214748364; i < bi.longValue(); i++)
		{
			System.out.println(i);
		}
		//2.147.483.649
		
	}

}
