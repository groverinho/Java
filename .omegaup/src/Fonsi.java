import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 18-08-16

public class Fonsi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad = in.nextLine();
		cad = cad.toLowerCase();
		if (cad.equals("fonsi"))
		{
			System.out.println("Es gay");
		}
		else
		{
			System.out.println("No es gay");
		}

	}

}
