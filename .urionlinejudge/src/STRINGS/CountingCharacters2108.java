/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 04/05/2018
 */
package STRINGS;

import java.util.Scanner;

public class CountingCharacters2108 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		String aux = "";
		while (in.hasNextLine()) {
			String cad = in.nextLine();
			if (cad.equals("0")) {
				System.out.println("\nThe biggest word: " + aux);
				break;
			}
			int c = 0;
			String result = "";
			String vec[] = cad.split(" ");

			for (int i = 0; i < vec.length; i++) {
				if (vec[i].length() >= max) {
					max = vec[i].length();
					aux = vec[i];
				}
				if (i + 1 == vec.length) {
					result = result.concat(vec[i].length() + "");
				} else {
					result = result.concat(vec[i].length() + "-");
				}

			}
			System.out.println(result);
		}
	}
}
