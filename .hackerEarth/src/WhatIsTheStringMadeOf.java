import java.util.Scanner;


public class WhatIsTheStringMadeOf {

	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);
			String cadena = in.next();
			int cont =0;
			for (int i = 0; i < cadena.length(); i++) 
			{
				if (cadena.charAt(i)=='1')
					cont = cont + 2;
				else if (cadena.charAt(i)=='2')
					cont = cont + 5;
				else if (cadena.charAt(i)=='3')
					cont = cont + 5;
				else if (cadena.charAt(i)=='4')
					cont = cont + 4;	
				else if (cadena.charAt(i)=='5')
					cont = cont + 5;
				else if (cadena.charAt(i)=='6')
					cont = cont + 6;
				else if (cadena.charAt(i)=='7')
					cont = cont + 3;
				else if (cadena.charAt(i)=='8')
					cont = cont + 7;
				else if (cadena.charAt(i)=='9')
					cont = cont + 6;
				else if (cadena.charAt(i)=='0')
					cont = cont + 6;
			}
			System.out.println(cont);

	}

}
