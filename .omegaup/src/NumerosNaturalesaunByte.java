import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class NumerosNaturalesaunByte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String a = Integer.toBinaryString(n);
		String ceros="";
		if (a.length()<8) {
			int aux = 8-a.length();
		
			for (int i = 0; i < aux; i++) {
				ceros+="0";
			}
		}
		System.out.println(ceros+a);

	}

}
