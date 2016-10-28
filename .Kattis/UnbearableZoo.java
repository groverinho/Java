import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
// Author: Grover Irusta M
// University: Universidad Privada Domingo Savio - Tarija
// Date: 27-10-16
import java.util.TreeSet;

public class UnbearableZoo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = 1;
		while (true) 
		{
			Map<String, Integer> mapa = new HashMap<String, Integer>();
			int n = Integer.parseInt(in.nextLine());
			if (n==0) {
				break;
			}
			for (int i = 0; i < n; i++) 
			{
				String cadena = in.nextLine();
				String[]vec= cadena.split(" ");
				String animal = vec[vec.length-1];
				animal = animal.toLowerCase();
				if (!mapa.containsKey(animal))
				{
					mapa.put(animal, 1);
				}
				else
				{
					mapa.put(animal, mapa.get(animal) + 1);
	
				}
			}
//			Iterator it = mapa.entrySet().iterator();
//		    while (it.hasNext()) {
//	        Map.Entry e = (Map.Entry)it.next();
//	        System.out.println(e.getKey() + " | "+ e.getValue());
//	   } 
		
		    
			System.out.println("List "+c+":");

		    SortedSet<String> keys = new TreeSet<String>(mapa.keySet());
		    for (String string : keys) {
				System.out.println(string + " | "+mapa.get(string));
			}
			c++;
		}
	}

}
