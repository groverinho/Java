/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 15/05/2018
 */
package BEGINNER;

import java.util.Scanner;

public class EntradaSalidaLeyendoSaltandoNombres2766 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad="";
		for (int i = 0; i < 10; i++) {
			cad = in.next();
			if(i==2 || i==6 || i==8) {
				System.out.println(cad);
			}
		}
	}

}
