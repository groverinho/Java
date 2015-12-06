import java.util.Scanner;


public class Porcentaje {

	public static void main(String[] args)
	{		
		Scanner in = new Scanner(System.in);
		String cadena = in.nextLine();
		while (!cadena.equals("#"))
		{		
			cadena.trim();
			cadena = cadena.replace("%","%25");
			cadena = cadena.replace(" ","%20");
			cadena = cadena.replace("!","%21");
			cadena = cadena.replace("$","%24");
			cadena = cadena.replace("(","%28");
			cadena = cadena.replace(")","%29");
			cadena = cadena.replace("*","%2a");
			System.out.println(cadena);
			cadena = in.nextLine();
		}
	}
}
