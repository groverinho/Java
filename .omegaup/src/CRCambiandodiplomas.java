
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CRCambiandodiplomas 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(entrada.readLine());
	String[]vieja  = new String[n];
	String[]nueva  = new String[n];
	String[]todo = new String[2];
	for (int i = 0; i < n; i++)
	{
		String aux = entrada.readLine();
		todo = aux.split(" ");
		 vieja[i] =todo[0];
		 nueva[i] =todo[1];
	}
	String cadena = entrada.readLine();
	for (int i = 0; i < n; i++)
		 cadena = cadena.replaceAll(vieja[i], nueva[i]);
	System.out.println(cadena);
	
	}
}
