

import java.io.*;

public class Motherbear10945 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String cadena;
		while (!(cadena = in.readLine()).equals("DONE")) 
		{
			String aux = "";
			for (int i = 0; i < cadena.length(); ++i)
				if (Character.isLetter(cadena.charAt(i)))
					aux += Character.toLowerCase(cadena.charAt(i));
			
			StringBuilder palindromo = new StringBuilder(aux);
			
			if (aux.equals(palindromo.reverse().toString()))
				System.out.println("You won't be eaten!");
			else
				System.out.println("Uh oh..");
		}
	}
}
