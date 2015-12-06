
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class AndyFirstDictionary10815 {

	public static HashSet<String> set = new HashSet<String>();
	public static String soloLetras(String cad)
	{
		String nuevo = "";
		for (int i = 0; i < cad.length() ; i++)
		{
			if (Character.isLetter(cad.charAt(i)))

				nuevo = nuevo + cad.charAt(i);
			else
			{
				nuevo = nuevo.toLowerCase();
				if (nuevo.length() > 0){
					set.add(nuevo);
				}
				nuevo = "";

			}
			
		}
		return nuevo;
	}
	public static void main(String[] args) throws IOException {
		Scanner in  = new Scanner(System.in);
		String cadena = "";
		
		ArrayList<String> lista  = new ArrayList<String>();
		
		//String nn = in.next();
		//int n = Integer.parseInt(nn);

		//while (n-->0)
		while (in.hasNext())
		{
			cadena = in.nextLine();
			cadena = cadena.toLowerCase();
			cadena = soloLetras(cadena);
			if (cadena.length()> 0){
				cadena = cadena.toLowerCase();
				set	.add(cadena);
			}
//			String vector []= cadena.split(" ");
//			for (int i = 0; i < vector.length; i++) {
//				set.add(vector[i]);
//			}
		}
		
//		 for (String s : set) 
//		 {
//	            lista.add(s);
		lista.addAll(set);

		 Collections.sort(lista);
		 for (int i = 0; i < lista.size(); i++)
		 {
			 System.out.println(lista.get(i));
		}
		
	}

}
