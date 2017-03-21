import java.util.Scanner;

/**
Name: Grover Irusta M.
Date: 2017
 */
public class AgregandoTareas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int c=0;
		for (int i = 0; i < n; i++) {
			int r = in.nextInt();
			if (r>p) {
				c++;
			}
		}
		System.out.println(c);
	}

}
