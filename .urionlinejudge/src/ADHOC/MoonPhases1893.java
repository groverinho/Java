/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 11/05/2018
 */
package ADHOC;

import java.util.Scanner;

public class MoonPhases1893 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			int aux = m;
			if (n > m) {
				if ((aux >= 0 && aux <= 2)) {
					System.out.println("nova");
				} else if (m >= 3 && m <= 96) {
					System.out.println("minguante");
				} else if ((aux >= 97 && aux <= 100)) {
					System.out.println("cheia");
				}
			} else {
				if ((aux >= 0 && aux <= 2)) {
					System.out.println("nova");
				} else if ((aux >= 3 && aux <= 96)) {
					System.out.println("crescente");
				} else if ((aux >= 97 && aux <= 100)) {
					System.out.println("cheia");
				}
			}

		}
	}
}
/*

0 2
2 3
99 97
97 94
30 35
*/