/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 16/05/2018
 */
package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class TheLibraryOfMrSeverino {
	/*public static String addZeros(int n) {
		String auxN = n+"";
		String aux ="";
		int size = 4-auxN.length();
		for (int i = 0; i < size; i++) {
			aux = aux.concat("0");
		}
		aux = aux.concat(auxN);
		return aux;
	}*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			String books[] = new String [n];
			for (int i = 0; i < n; i++) {
				books[i] = in.next();
			}
			Arrays.sort(books);
			for (int i = 0; i < books.length; i++) {
				System.out.println(books[i]);
			}
		}
	}

}
