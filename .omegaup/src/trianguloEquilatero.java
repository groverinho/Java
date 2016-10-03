import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 02-10-16

public class trianguloEquilatero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lados  [] = new int [4];
		for (int i = 0; i < lados.length; i++) {
			lados[i]=in.nextInt();
		}
		Arrays.sort(lados);
		if ((lados[0]==lados[1] && lados[1]==lados[2])|| (lados[1]==lados[2] && lados[2]==lados[3])) {
			System.out.println(1);
		}
		else
			System.out.println(0);
	}

}
