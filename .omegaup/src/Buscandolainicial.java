import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class Buscandolainicial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char s = in.next().charAt(0);
		int p = in.nextInt();
		for (int i = 0; i < p; i++) {
			String cad = in.next();
			if (s==cad.charAt(0)) {
				System.out.println(cad);
				
			}
		}
		

	}

}
