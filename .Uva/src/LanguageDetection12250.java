import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LanguageDetection12250 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int cont = 0;
		String idioma = in.next();
		//HashMap<String, String> mapa = null;
		Map<String, String> mapa = new HashMap<String,String>() ;
		mapa.put("HELLO", "ENGLISH");
		mapa.put("HOLA", "SPANISH");
		mapa.put("HALLO", "GERMAN");
		mapa.put("BONJOUR", "FRENCH");
		mapa.put("CIAO", "ITALIAN");
		mapa.put("ZDRAVSTVUJTE", "RUSSIAN");
		while (!idioma.equals("#")) 
		{
			cont++;
		
			if (mapa.containsKey(idioma))
			{
				System.out.println("Case "+cont+": "+mapa.get(idioma));
			}
			else
				System.out.println("Case "+cont+": "+"UNKNOWN");
			idioma = in.next();
		}
	}

}
