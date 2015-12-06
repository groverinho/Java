

import java.util.*;

public class AndysSecondDictionary11062 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<String> dict = new ArrayList<String>();
		String tmp = "";
		while (in.hasNextLine()) 
		{
			String cadena = in.nextLine();
			int i = 0;
			while (i < cadena.length())
			{
				String cad = "";
				while (i < cadena.length() && !Character.isLetter(cadena.charAt(i)) && cadena.charAt(i) != '-')
					++i;
				while (i < cadena.length() && (Character.isLetter(cadena.charAt(i)) || cadena.charAt(i) == '-'))
				{
					cad += cadena.charAt(i);
					++i;
				}
				cad = tmp + cad.toLowerCase();
				if (cad.isEmpty())
					continue;
				if (!tmp.isEmpty())
					tmp = "";
				if (i >= cadena.length()) 
				{
					if (cad.charAt(cad.length() - 1) == '-')
						tmp = cad.substring(0, cad.length() - 1);
					else 
					{
						if (!dict.contains(cad))
							dict.add(cad);
					}
				} 
				else 
				{
					if (!dict.contains(cad))
						dict.add(cad);
				}
				++i;
			}
		}
		Collections.sort(dict);
		for (String palabra : dict)
			System.out.println(palabra);
	}
}