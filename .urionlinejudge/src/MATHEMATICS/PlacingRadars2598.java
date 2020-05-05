import java.util.Scanner;

/**
 * @author Grover Irusta Miranda
 * @date day/month/2020
 * @company Mojix/Xtime
 */

public class PlacingRadars2598 {

	/**
	
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		for (int i = 0; i < c; i++) {
			long n = in.nextLong();
			long m = in.nextLong();
			if(n<m) System.out.println(1);
			else if(n%m==0)	System.out.println(n/m);
			else System.out.println((n/m)+1);
		}
	}

}
