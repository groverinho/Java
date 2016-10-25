import java.math.BigInteger;
import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 24-10-16
 */

public class UltraFastMathematician {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)==b.charAt(i)) {
				System.out.print(0);
			}
			else
				System.out.print(1);

		}
		System.out.println();

	}

}
