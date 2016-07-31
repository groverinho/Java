import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Letritas {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			String cadena = in.next();
			int vector []= new int[26];
			
			for (int i = 0; i < cadena.length(); i++) 
			{
				int j =0;
				for (char a = 'A'; a <='Z'; a++) 
				{
					if (cadena.charAt(i)==a) 
					{
						vector[j]++;
						break;
					}
					j++;
				}
			}
			int n =in.nextInt();
			int[] vector2 = {};
			for (int i = 0; i < n; i++) 
			{
				 vector2= new int[26];
				String cadena2 = in.next();
				for (int j = 0; j < cadena2.length(); j++)
				{
					int k = 0;
					for (char a = 'A'; a <='Z'; a++) 
					{
						if (cadena2.charAt(j)==a) 
						{
							vector2[k]++;
							break;
						}
						k++;
					}
				}
				boolean bandera = false;
				Set<Character> letras =new HashSet<Character>();
				for (int j = 0; j < cadena2.length(); j++) 
				{
					letras.add(cadena2.charAt(j));
				}
				for (Character character : letras)
				{
					int index=0;
					for (char a = 'A'; a <='Z'; a++) 
					{
						if (character==a) 
						{
							break;
						}
						index++;
					}
					if (vector[index]<vector2[index] )
						{
							bandera= true;
							break;
						}
				}
//				for (int j = 0; j < vector2.length; j++) 
//				{
//					
//					if (vector[i]!=vector2[i])
//					{
//						bandera= true;
//						break;
//					}
//				}
				System.out.println(bandera?"NO":"SI");
			
			}
			
		}

	}

}
