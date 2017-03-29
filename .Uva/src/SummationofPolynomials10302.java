import java.math.BigInteger;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
Date: -2017
 */

public class SummationofPolynomials10302 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger [] vector = new BigInteger[50100];
		vector[0]= BigInteger.ONE;
		for (int i = 1; i < vector.length; i++) {
			vector[i] = vector[i-1].add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i))));
		}
		while (in.hasNext()) {
			int a = in.nextInt();
			System.out.println(vector[a].subtract(BigInteger.ONE));
	
		}
		
	}

}
