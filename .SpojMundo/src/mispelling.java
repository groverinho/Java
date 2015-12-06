

import java.util.Scanner;

public class mispelling {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++)
		{
			int n = in.nextInt();
			String cadena = in.next();
			String aux = "";
			for (int j = 0; j < cadena.length(); j++)
			{
				if (j!=(n-1))
				{
				aux = aux + cadena.charAt(j)	;
				}
			}
			System.out.println((i+1)+" "+aux);
		}
		 

	}

}
