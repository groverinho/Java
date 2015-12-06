import java.util.Scanner;


public class BajandoLosCaracteres {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String cadena = in.next();
		
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
	}

}
