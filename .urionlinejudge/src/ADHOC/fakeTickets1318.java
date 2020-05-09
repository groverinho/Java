import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date 9/5/2020
 * @company
 */

public class fakeTickets1318 {

	/**
	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			int m = in.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int[] listTickets = new int[10001];
			int c = 0;
			for (int i = 0; i < m; i++) {
				int index = in.nextInt();
				listTickets[index]++;
				if (listTickets[index] == 2) {
					c++;
				}
			}
			System.out.println(c);
		}
	}

}
