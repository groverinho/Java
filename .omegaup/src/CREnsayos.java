import java.util.Scanner;


public class CREnsayos {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String cadena = in.nextLine();
		String cadnueva =  cadena.toLowerCase();
		String primera = cadnueva.charAt(0)+"";
		primera = primera.toUpperCase();
		String aux ="";
		for (int i = 1; i < cadnueva.length(); i++) 
		{
			if (i!=cadnueva.length()-1) 
			{
				if (cadnueva.charAt(i)== '.'||cadnueva.charAt(i)== '?'||cadnueva.charAt(i)== '!') 
				{
					String mayuscula=cadnueva.charAt(i+2)+"";
					mayuscula=mayuscula.toUpperCase();
					cadnueva=cadnueva.replaceAll (cadnueva.charAt(i+2)+"", mayuscula); 
				}
			}
			aux = aux + cadnueva.charAt(i)+"";
			
		}
		System.out.println(primera.concat(aux));
	}

}
