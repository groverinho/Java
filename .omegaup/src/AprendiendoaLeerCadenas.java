import java.util.Scanner;


public class AprendiendoaLeerCadenas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine())
		{
			String cadena = in.nextLine();
			char comilla = '"';
			System.out.println(comilla+""+cadena+""+comilla +" tiene "+ cadena.length() +" caracteres");
		}

	}

}
