import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CalculatingFunction {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!entrada.ready())
		{
			
		
		BigInteger n = new BigInteger(entrada.readLine()); 
		BigInteger aa;
		aa = n.mod(BigInteger.valueOf(2));
		if( aa.compareTo(BigInteger.ZERO) == 0 )
		{
			n =n.divide(BigInteger.valueOf(2));
			System.out.println(n);
		}
		else
		{
			n =n.add(BigInteger.ONE);
			n =n.divide(BigInteger.valueOf(2));	
			n = n.multiply(BigInteger.valueOf(-1));
			System.out.println(n);
		}
		}
	}

}	
