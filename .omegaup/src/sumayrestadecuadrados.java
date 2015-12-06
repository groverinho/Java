import java.math.BigInteger;
import java.util.Scanner;


public class sumayrestadecuadrados {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		BigInteger resultado2 = n.pow(2);
		BigInteger resultado = BigInteger.valueOf(0);
		for (BigInteger bi = BigInteger.valueOf(1); 
		bi.compareTo(n) <= 0;
	    bi = bi.add(BigInteger.ONE)) 
		{
			if (bi.mod(BigInteger.valueOf(2)) ==  BigInteger.valueOf(0))
			{
				resultado= resultado.add((n.subtract(bi).pow(2)));
			}
			else
			{
				resultado= resultado.subtract((n.subtract(bi).pow(2)));
			}
	     
		} 
	
		BigInteger resultado3 =  BigInteger.valueOf(0);
		for (BigInteger bi = n;
	            bi.compareTo(BigInteger.ZERO) > 0;
	            bi = bi.subtract(BigInteger.ONE)) {

			if (bi.mod(BigInteger.valueOf(2)) !=  BigInteger.valueOf(0))
			{
				resultado3= resultado3.add(bi.pow(2));
			}
			else
			{
				resultado3= resultado3.subtract(bi.pow(2));
			}
	    }
		System.out.println((resultado2.add(resultado)));
    }
}
