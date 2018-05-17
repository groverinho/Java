/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 17/05/2018
 */
package STRINGS;

import java.util.Scanner;

public class RplusLequalsJ_2557 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String cad = in.next();
			String v[];
			if (cad.contains("J")) {
				cad = cad.replaceAll("[+]", " ").replaceAll("['J',=]", "");
				v = cad.split(" ");
				System.out.println(Integer.parseInt(v[0]) + Integer.parseInt(v[1]));
			} else if (cad.contains("L")) {
				cad = cad.replaceAll("[+]", " ").replaceAll("['L','R',=]", "");
				v = cad.split(" ");
				System.out.println(Integer.parseInt(v[1]) - Integer.parseInt(v[0]));
			} else if (cad.contains("R")) {
				cad = cad.replaceAll("[R+]", "").replaceAll("['J',=]", " ");
				v = cad.split(" ");
				System.out.println(Integer.parseInt(v[1]) - Integer.parseInt(v[0]));
			}
		}
	}

}
