import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 31-10-16
 */

public class JusttheFacts568 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
	Scanner in = new Scanner(System.in);
	
	while (in.hasNext()) 
	{
		int n  =in.nextInt();
		BigInteger aux  = BigInteger.ONE;
		for (int i = 1; i <=n; i++) {
			aux = aux.multiply(BigInteger.valueOf(i));
		}
		String cad2 = aux.toString();
		cad2 = cad2.replaceAll("0", "");
	//	System.out.println(""+cad2.charAt(cad2.length()-1));
		System.out.printf("%5d -> %d\n", n, Integer.parseInt(cad2.charAt(cad2.length()-1)+""));
	}


	
	

	}

}
