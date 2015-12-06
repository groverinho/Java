import java.util.Scanner;


public class Escribiralreves {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String cadena = in.next();
		StringBuilder cad= new StringBuilder(cadena);
		System.out.println(cad.reverse());
	}

}
