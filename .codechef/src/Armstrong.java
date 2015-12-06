import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Armstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
			int n = Integer.parseInt(in.readLine());
			int n2 = Integer.parseInt(in.readLine());
			ArrayList<Integer> lista = new ArrayList<Integer>();
			for (int i = n; i <=n2; i++) 
			{
				String cad = i+"";
				int potencia = cad.length();
				int aux=0;
		chau:	for (int j = 0; j < cad.length(); j++)
				{
					if (aux>i) 
						break chau;
					aux+= Math.pow(Integer.parseInt(cad.charAt(j)+""), potencia);	
				}
				if (aux==i) 
					lista.add(aux);
			}
			for (int i = 0; i < lista.size(); i++)
			{
				System.out.println(lista.get(i));
			}
	}
}
