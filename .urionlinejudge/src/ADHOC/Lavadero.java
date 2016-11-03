/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 02/11/16
 */
package ADHOC;

import java.util.Scanner;

public class Lavadero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		int la = in.nextInt();
		int lb = in.nextInt();
		int sa = in.nextInt();
		int sb = in.nextInt();
		if (n>=la && n<=lb) {
			if (n>=sa && n<=sb) {
				System.out.println("possivel");
			}
			else
				System.out.println("impossivel");	
		}
		else
		{
			System.out.println("impossivel");
		}

	}

}
