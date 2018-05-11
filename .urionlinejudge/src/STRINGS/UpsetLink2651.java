/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 11/05/2018
 */
package STRINGS;

import java.util.Scanner;

public class UpsetLink2651 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		s = s.toLowerCase();
		System.out.println(s.contains("zelda")?"Link Bolado":"Link Tranquilo");
	}
}
