/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 31-10-16
 */
package STRINGS;

import java.util.Scanner;

public class InternationalChat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int n =in.nextInt();
			String idioma = in.next();
			boolean bandera = true;
			for (int i = 0; i < n-1; i++)
			{
				String idioma2 = in.next();
				if (!idioma.equals(idioma2)) {
					bandera= false;	
				}
			}
			if (!bandera) {
				System.out.println("ingles");
			}
			else
				System.out.println(idioma);
		}

	}

}
