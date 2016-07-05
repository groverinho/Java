

import java.util.*;
import java.math.*;

public class ILoveBigNumbers10220 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			int n = in.nextInt();
			BigInteger fact = BigInteger.ONE;
			
			for (int i = 2; i <= n; ++i)
				fact = fact.multiply(BigInteger.valueOf(i));
			String cad = fact.toString();
			//System.out.println(fact);
			int sum = 0;
			for (int i = 0; i < cad.length(); ++i)
				sum += Integer.parseInt(cad.charAt(i)+"");
			System.out.println(sum);
		}
	}
}