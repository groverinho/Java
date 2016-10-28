import java.util.Scanner;

// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 27/10/16

public class Apaxiaaaaaaaaaaaans {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String  cad = in.next();
		String nueva=cad.charAt(0)+"";
		
		for (int i = 1; i < cad.length(); i++) {
			if (!nueva.endsWith(cad.charAt(i)+"")) {
				nueva+=cad.charAt(i);
			}
		}
			System.out.println(nueva);
	}

}
