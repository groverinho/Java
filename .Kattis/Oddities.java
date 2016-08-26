import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 

public class Oddities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int csaos = in.nextInt();
	while (csaos-->0)
	{
	int n =in.nextInt();
	System.out.print(n+" is ");
	System.out.println((n%2==0)?"even":"odd");
	}

	}

}
