import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class SloganLearningofPrincess12592 {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int casos1 = Integer.parseInt(in.readLine());
		HashMap<String, String> mapa = new HashMap<String, String>();
		
		while (casos1 --> 0)
		{
			String cad1 = in.readLine();
			String cad2 = in.readLine();
			mapa.put(cad1, cad2);
		}
		int casos2 = Integer.parseInt(in.readLine());
		while (casos2-->0)
		{
			String consulta = in.readLine();
			System.out.println(mapa.get(consulta));
		}

	}

}
