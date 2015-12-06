
import java.util.*;
import java.io.*;

public class Babelfish10282 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, String> diccionario = new HashMap<String, String>();
		String cad;
		while (!(cad = in.readLine()).isEmpty())
		//while ((cad = in.readLine()) != null)
		{
			String[] vec = cad.split("[ ]+");
			String ingles = vec[0];
			String otro = vec[1];
			diccionario.put(otro, ingles);
		}
		while ((cad = in.readLine()) != null) 
		{
			if (diccionario.containsKey(cad))
				System.out.println(diccionario.get(cad));
			else
				System.out.println("eh");
		}

	}
}
