import java.math.BigInteger;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 24-10-16
 */

public class TheMonsterandtheSquirrel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		//3 da 1 con 4 da 4 con 5 da 9 con 6 16
		/*
		 entonces quito 2 y elevo a dos
		 */
		System.out.println(n.subtract(BigInteger.valueOf(2)).pow(2));

	}

}
