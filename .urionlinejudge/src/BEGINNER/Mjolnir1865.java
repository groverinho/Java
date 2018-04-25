/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 25/04/2018
 */
package BEGINNER;

import java.util.Scanner;

public class Mjolnir1865 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int force = in.nextInt();
			if (name.equals("Thor")) {
				System.out.println("Y");
			}
			else {
				System.out.println("N");
			}
		}
	}

}
