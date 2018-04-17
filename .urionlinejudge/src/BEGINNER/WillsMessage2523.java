/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 17/04/2018
 */

package BEGINNER;

import java.util.Scanner;

public class WillsMessage2523 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String cad = in.next();
			int n = in.nextInt();
			int[] array = new int[n];
			String newCad = "";
			for (int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
				newCad = newCad.concat(String.valueOf(cad.charAt(array[i] - 1)));
			}
			System.out.println(newCad);
		}
	}
}
