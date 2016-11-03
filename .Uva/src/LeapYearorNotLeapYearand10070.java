import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 02-11-16
 */

public class LeapYearorNotLeapYearand10070 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String cad;
		int t=0;
		while ((cad=in.readLine())!=null) 
		{
			BigInteger n=new BigInteger(cad);
			boolean bisiesto=n.mod(new BigInteger("400")).equals(BigInteger.ZERO) || (n.mod(new BigInteger("4")).equals(BigInteger.ZERO) && !n.mod(new BigInteger("100")).equals(BigInteger.ZERO));
			boolean huluculu=n.mod(new BigInteger("15")).equals(BigInteger.ZERO);
			boolean bulukulu=bisiesto && n.mod(new BigInteger("55")).equals(BigInteger.ZERO);
			boolean noesBiciesto=!(bisiesto || huluculu || bulukulu);
			if (t++>0) {
				System.out.println();
			}
			if (bisiesto)
				System.out.println("This is leap year.");
			if (huluculu)
				System.out.println("This is huluculu festival year.");
			if (bulukulu)
				System.out.println("This is bulukulu festival year.");
			if (noesBiciesto)
				System.out.println("This is an ordinary year.");
		}
	}
}
