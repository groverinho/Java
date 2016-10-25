import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 20-10-16
 */

public class AddingReversedNumbers {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int casos = Integer.parseInt(in.readLine());
	while (casos-- > 0) {
		String[] vector = in.readLine().split("[ ]");
		BigInteger n1 = new BigInteger(new StringBuffer(vector[0]).reverse().toString());
		BigInteger n2 = new BigInteger(new StringBuffer(vector[1]).reverse().toString());
		
		String res = new StringBuffer(n1.add(n2).toString()).reverse().toString();
		while (res.length() > 1 && res.charAt(0) == '0')
			res = res.substring(1);
		System.out.println(res);
	}
	

	}

}
