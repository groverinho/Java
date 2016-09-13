// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 13-09-16
package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class Huaauhahhuahau {

	public static boolean isVocal(char c )
	{
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return true;
		}
		else return false;
	
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String cadena  = in.next();
			String nueva = "";
			for (int i = 0; i < cadena.length(); i++) {
				if (isVocal(cadena.charAt(i))) {
					nueva += cadena.charAt(i);
				}
			}
			StringBuilder cad1 = new StringBuilder(nueva);
			cad1 = cad1.reverse();
			
				System.out.println(nueva.equals(cad1+"")?"S":"N");
			}
		

		
	}
}
