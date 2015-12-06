package STRINGS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HiddenMessageMAL {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int n =Integer.parseInt(entrada.readLine());
		while (n>0)
		{
			String cadena = entrada.readLine();
			String primercaract= "";
			if (cadena.charAt(0)!=' ') 
			{
				 primercaract = cadena.substring(0, 1);
			}
			if (cadena.length()==1) 
			{
				System.out.println("");
			}
			else
			{
				String aux="";
	jajaja:		for (int i = 1; i < cadena.length(); i++) 
				{
						if (cadena.charAt(i)==' ')
						{
							if (i+1 != cadena.length())
							{
								while (cadena.charAt(i)==' ') 
								{
									if (i+1== cadena.length())
									{
										break jajaja;
									}
									i++;
								}
								aux = aux + cadena.charAt(i);
							}		
					}
				}
					System.out.println(primercaract.concat(aux));
			}
			n--;
		
		}
	}
}
