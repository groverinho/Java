import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 18/04/2018
 */

public class ParoImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n%2==0?"Par":"Impar");
	}

}
