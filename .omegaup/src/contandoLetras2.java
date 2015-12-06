

import java.util.Scanner;

public class contandoLetras2 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int inicio = entrada.nextInt();
		int fin = entrada.nextInt();
		String palabra = entrada2.nextLine();
		
		for (char i = 'a'; i <= 'z'; i++) 
		{
			int cont =0;
			for (int j = inicio; j <= fin; j++)
			{
				if(i==palabra.charAt(j))
				{
					cont++;
				}
			}
			System.out.println(i+"="+cont);
		}
	}

}
