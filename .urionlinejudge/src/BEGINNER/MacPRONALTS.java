import java.util.Scanner;

/**
 5
1001 500
1005 300
1003 23
1002 52
1004 44
 */

/**
 * @author Grover Irusta
 * @company Coderoad - Mojix
 * @date 04-02-20
 */
public class MacPRONALTS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		double total = 0;
		for (int i = 0; i < cases; i++) {
			int product = in.nextInt();
			int value = in.nextInt();
			switch (product) {
			case 1001:
				total+= value*1.5;
				break;
			case 1002:
				total+= value*2.5;
				break;
			case 1003:
				total+= value*3.5;
				break;
			case 1004:
				total+= value*4.5;
				break;
			case 1005:
				total+= value*5.5;
				break;
			default:
				break;
			}
		}
		System.out.printf("%.2f\n", total);
	}

}
