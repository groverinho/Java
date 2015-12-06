import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoGritar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(entrada.readLine());
		while (casos>0)
		{
			String cadena = entrada.readLine();
			for (int i = 0; i < cadena.length(); i++) 
			{
				if (cadena.charAt(i)==' ' && (cadena.charAt(i+1)=='p' || cadena.charAt(i+1)=='o'))
				{
					i++;
					int aux = 0;
					boolean bandera = true;
					while (cadena.charAt(i)!=' ')
					{
						if (cadena.charAt(i)=='o')
						{
							bandera = false;
						}
						aux++;
						i++;
					}
					if (bandera==false)
					{
						int aux2 = i-aux;
						for (int j = 0; j < aux; j++)
						{
							//cadena.subSequence(i-aux, aux)=;
						}
					}
				}
			}
			casos--;
		}

	}

}
