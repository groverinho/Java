import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alrevés2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String numeros = entrada.readLine();
		
		String[] vector = new String [2];
		vector = numeros.split(" ");
		int ini = Integer.parseInt(vector[0]);
		int fin = Integer.parseInt(vector[1]);
		String cadena = entrada.readLine();
		String cadAux  = "";
	
		for (int i = ini; i <=fin; i++)
		{
			cadAux = cadAux + cadena.charAt(i);
		}
		StringBuilder cad = new StringBuilder(cadAux);
		cad =cad.reverse();
		System.out.print(cad);
		for (int i = fin+1; i < cadena.length(); i++) 
		{
			System.out.print(cadena.charAt(i));
		}
	}

}
