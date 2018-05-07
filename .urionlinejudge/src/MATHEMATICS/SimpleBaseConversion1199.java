/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 07/05/2018
 */
package MATHEMATICS;

import java.util.Scanner;

public class SimpleBaseConversion1199 {

	public static long hexaToInt(String hex) {
		return Long.parseLong(hex, 16);
	}

	public static String intToHexa(long n) {
		return Long.toHexString(n).toUpperCase();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String n = in.next();
			if (n.equals("-1")) {
				break;
			}
			if (n.length() > 2 && n.charAt(1) == 'x') {
				System.out.println(hexaToInt(n.substring(2)));
			} else {
				System.out.println("0x" + intToHexa(Long.parseLong(n)));
			}
			;
		}
	}
}
