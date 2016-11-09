/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 18-10-16
 */
package ADHOC;

import java.util.Scanner;

public class MeanMedianProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a==0 && b==0) {
				break;
			}
			System.out.println(a-(b-a));	
		}
		
	}

}
